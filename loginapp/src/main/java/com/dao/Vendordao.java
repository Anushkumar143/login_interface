package com.dao;
import java.sql.*;
import com.db.Dbconnection;
import com.model.Vendormodel;
public class Vendordao 
{
	Dbconnection db=new Dbconnection();
	public boolean products(Vendormodel s)
	{
		String sql = "INSERT INTO vendordetails(name, companyname, gst, productname, price, category, quantity, description) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try(Connection con=db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql))
			{
			
			ps.setString(1,s.getvname());
			ps.setString(2,s.getcompany());
			ps.setInt(3, Integer.parseInt(s.getgst()));        
			ps.setString(4,s.getpname());
			ps.setInt(5, Integer.parseInt(s.getprice()));      
			ps.setString(6,s.getcategory());
			ps.setInt(7, Integer.parseInt(s.getquantity()));
			ps.setString(8,s.getdescription());

			int result = ps.executeUpdate();
			return result>0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
