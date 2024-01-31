package com.example.SpringProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	
	@Id
	@Column(name="employee_id",length=50)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeid;
	
	@Column(name="employee_name",length=50)
	private String employeename;
	
	@Column(name="employee_mail",length=80)
	private String employeemail;
	
	@Column(name="employee_password",length=80)
	private String employeepassword;
	
	public Employee(String employeename, String employeemail, String employeepassword, String mobile) {
		super();
		this.employeename = employeename;
		this.employeemail = employeemail;
		this.employeepassword = employeepassword;
		this.mobile = mobile;
	}

	@Column(name="employee_mobile",length=80)
	private String mobile;

	public Employee(int employeid, String employeename, String employeemail,String employeepassword, String mobile) {
//		super();
		this.employeid = employeid;
		this.employeename = employeename;
		this.employeemail = employeemail;
		this.mobile = mobile;
		this.employeepassword=employeepassword;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeemail() {
		return employeemail;
	}

	public void setEmployeemail(String employeemail) {
		this.employeemail = employeemail;
	}

	public String getEmployeepassword() {
		return employeepassword;
	}

	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [employeid=" + employeid + ", employeename=" + employeename + ", employeemail=" + employeemail
				+ ", employeepassword=" + employeepassword + ", mobile=" + mobile + "]";
	}

	
	
}
