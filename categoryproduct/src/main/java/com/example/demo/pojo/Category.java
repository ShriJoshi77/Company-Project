package com.example.demo.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	int cid;
	String categoryname;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	List<Product> pro;

	public Category() {
		super();
	}

	public Category(int cid, String categoryname, List<Product> pro) {
		super();
		this.cid = cid;
		this.categoryname = categoryname;
		this.pro = pro;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String catagoryname) {
		this.categoryname = catagoryname;
	}

	public List<Product> getPro() {
		return pro;
	}

	public void setPro(List<Product> pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", categoryname=" + categoryname + ", pro=" + pro + "]";
	}

}
