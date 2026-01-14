package com.dao;
import java.sql.*;
import com.model.*;
import com.db.Dbconnection;
public class Userdao 
{
	Dbconnection db=new Dbconnection();
	public Usermodel valid(Usermodel s) 
	{
		String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
		try(Connection con=db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql))
		{
			ps.setString(1,s.getemail());
			ps.setString(2,s.getpassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Usermodel um=new Usermodel();
				um.setfirstname(rs.getString("firstname"));
				um.setphone(rs.getString("phone"));
				um.setemail(rs.getString("email"));	
				return um;
			}
			return null;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public boolean register(Usermodel s) {
	    String sql = "INSERT INTO users(firstname, lastname, dob, email, phone, password) VALUES (?, ?, ?, ?, ?, ?)";
	    
	    System.out.println("Attempting to register user: " + s.getemail());
	    
	    try(Connection con = db.getConnection();
	        PreparedStatement ps = con.prepareStatement(sql)) {
	        
	        ps.setString(1, s.getfirstname());
	        ps.setString(2, s.getlastname());
	        
	        // Fix date format issue
	        String dobString = s.getdob();
	        System.out.println("DOB string: " + dobString);
	        
	        try {
	            // Handle different date formats
	            java.sql.Date sqlDate = null;
	            if (dobString != null && !dobString.trim().isEmpty()) {
	                // Try to parse the date - handle dd-MM-yyyy format
	                String[] parts = dobString.split("-");
	                if (parts.length == 3) {
	                    // Convert dd-MM-yyyy to yyyy-MM-dd
	                    String formattedDate;
	                    if (parts[2].length() == 2) {
	                        // Handle 2-digit year
	                        formattedDate = "19" + parts[2] + "-" + parts[1] + "-" + parts[0];
	                    } else {
	                        // Handle 4-digit year
	                        formattedDate = parts[2] + "-" + parts[1] + "-" + parts[0];
	                    }
	                    sqlDate = java.sql.Date.valueOf(formattedDate);
	                } else {
	                    // Try standard format
	                    sqlDate = java.sql.Date.valueOf(dobString);
	                }
	            }
	            ps.setDate(3, sqlDate);
	            System.out.println("Converted DOB: " + sqlDate);
	        } catch (Exception e) {
	            System.out.println("Date conversion error: " + e.getMessage());
	            ps.setDate(3, null); // Set to null if date is invalid
	        }
	        
	        ps.setString(4, s.getemail());
	        ps.setString(5, s.getphone());
	        ps.setString(6, s.getpassword());
	        
	        int rs = ps.executeUpdate();
	        System.out.println("Rows affected: " + rs);
	        return rs > 0;
	        
	    } catch(java.sql.SQLIntegrityConstraintViolationException e) {
	        // Handle duplicate email error
	        System.out.println("Registration failed: Email already exists - " + s.getemail());
	        return false;
	    } catch(Exception e) {
	        System.out.println("Database error: " + e.getMessage());
	        return false;
	    }
	}
	public String forgot(Usermodel s) 
	{
		String sql = "Select password from users where email=? ";
		try(Connection con=db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql))
			{
				ps.setString(1,s.getemail());
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					return rs.getString("password");
				}
			return null;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public boolean reset(Usermodel s) 
	{
		String sql = "update users set password =? where email=? ";
		try(Connection con=db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql))
			{
				ps.setString(1,s.getpassword());
				ps.setString(2,s.getemail());
				int rs = ps.executeUpdate();
				return rs>0;
			}
			catch(Exception e)
			{
				return false;
			}
	}

}
