package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employers")
public class Employers extends Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="compony_name")
	private String compony_name;
	
	@Column(name="website_url")
	private String website_url;
	
	@Column(name="phone")
	private String phone;

	public String getCompony_name() {
		return compony_name;
	}

	public void setCompony_name(String compony_name) {
		this.compony_name = compony_name;
	}

	public String getWebsite_url() {
		return website_url;
	}

	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
