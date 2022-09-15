package com.springset.springset.entity;

public class product {
     private int id;
     private String name;
     private String Type;
     private String catagory;
     private double price;
     private double discount;
     private double gst;
     private double charges;
     private double finalprice;
	public product(int id, String name, String type, String catagory, double price, double discount, double gst,
			double charges, double finalprice) {
		super();
		this.id = id;
		this.name = name;
		Type = type;
		this.catagory = catagory;
		this.price = price;
		this.discount = discount;
		this.gst = gst;
		this.charges = charges;
		this.finalprice = finalprice;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public double getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", Type=" + Type + ", catagory=" + catagory + ", price=" + price
				+ ", discount=" + discount + ", gst=" + gst + ", charges=" + charges + ", finalprice=" + finalprice
				+ "]";
	}
     
     
}
