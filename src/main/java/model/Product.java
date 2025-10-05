package model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GenericGenerator(name = "uuid", strategy = "uuid2")
private String productId;
private String productName;
private String productCategory;
private double productPrice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

}
