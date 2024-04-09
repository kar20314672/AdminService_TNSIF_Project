package com.tns.customerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin_service
{
	@Id
	@Column(name="id")
	private int cid;               //GitRepository token: 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

	@Column(name="name")
	private String cname;
	
	@Column(name="age")
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	@Column(name="address")
	private String address;
	
	@Column(name="Phone_no")
	private int ph_no;
	
	@Column(name="Aadhar_no")
	private int aadhar;

	public int getCid() {
		return cid;
	}
	public int getPh_no() {
		return ph_no;
	}
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Admin_service(int cid, String cname, int age, String address, int ph_no, int aadhar) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.address = address;
		this.ph_no = ph_no;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Admin_service [cid=" + cid + ", cname=" + cname + ", age=" + age + ", address=" + address + ", ph_no="
				+ ph_no + ", aadhar=" + aadhar + ", getAge()=" + getAge() + ", getAadhar()=" + getAadhar()
				+ ", getCid()=" + getCid() + ", getPh_no()=" + getPh_no() + ", getCname()=" + getCname()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
