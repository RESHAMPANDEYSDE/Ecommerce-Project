package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orderr 
{   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
	@OneToMany
	private List<Product> products;
	private double TotalAmount;
	public  Orderr()
	{
		
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", products=" + products + ", TotalAmount=" + TotalAmount + "]";
	}
	public Orderr(long id, List<Product> products, double totalAmount) {
		super();
		this.id = id;
		this.products = products;
		TotalAmount = totalAmount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
}
