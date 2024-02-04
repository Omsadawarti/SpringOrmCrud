package com.SpringOrm.Entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.stereotype.Component;

@Component("employee")
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int employeeId;
	
	@Column(name = "name")
	private String employeeName;
	
	@Column(name = "phone")
	private long employeePhone;
	
	@Column(name = "address")
	private String employeeAddress;
	
	private int status;
	
	@Version
	private int version;
	
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeAddress=" + employeeAddress + "]";
	}
	
	

}
