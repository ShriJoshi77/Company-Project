package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int productid;
	String productname;
	int productMRP;
	public Product()
	{
		
	}
	
	public Product(int productid, String productname, int productMRP) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productMRP = productMRP;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductMRP() {
		return productMRP;
	}
	public void setProductMRP(int productMRP) {
		this.productMRP = productMRP;
	}
	
	
}
