package com.restaurant.management.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Restaurant  
{  
	//Defining book id as primary key  
	@Id  
	@Column  
	private int id;  
	@Column  
	private String name;  
	@Column  
	private String adresse;  
	@Column  
	private String phone;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", adresse=" + adresse + ", phone=" + phone + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAdresse()=" + getAdresse() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



}
