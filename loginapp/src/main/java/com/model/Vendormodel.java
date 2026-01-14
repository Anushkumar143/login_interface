package com.model;

public class Vendormodel 
{
	 String vname ;
     String company ;
     String gst ;   
     String pname ;
     String price ;
     String category ;
     String quantity; 
     String description ;
	 public String getvname() {	 return vname;	}
	 public String getcompany() {	 return company;	}
	 public String getgst() {		 return gst;	 }
	 public String getpname() {		 return pname;	 }
	 public String getprice() {		 return price;	 }
	 public String getcategory() {		 return category;	 }
	 public String getquantity() {		 return quantity;	 }
	 public String getdescription() {		 return description;	 }
	 
	 public Vendormodel(String vname, String company, String gst, String pname, String price, String category,
			String quantity, String description)
	 {
		this.vname = vname;
		this.company = company;
		this.gst = gst;
		this.pname = pname;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.description = description;
	}
}
