package org.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Table
@Component
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	private String email;
	
	
	public int getId() {
		return id;
	}
	
	@Value (value = "4")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Value (value = "pratik")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	
	@Value (value ="bandra")
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	
	@Value (value ="5467893")
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	
	@Value (value = "pratik@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ "]";
	}
}
