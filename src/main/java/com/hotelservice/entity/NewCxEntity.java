package com.hotelservice.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class NewCxEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String lastname;
	private String email;
	private String about;
@Transient
List<Rating> rating=new ArrayList<>();
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
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
public List<Rating> getRating() {
	return rating;
}
public void setRating(List<Rating> rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "NewCxEntity [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", about="
			+ about + ", rating=" + rating + "]";
}
public NewCxEntity(int id, String name, String lastname, String email, String about, List<Rating> rating) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.email = email;
	this.about = about;
	this.rating = rating;
}
public NewCxEntity() {
	super();
	// TODO Auto-generated constructor stub
}

	
	

}
