package com.example.SpringProject.DTO;

public class EmployeeSaveDTO {

	
	private String employeename;
	private String employeemail;
	private String employeepassword;
	private String mobile;
	
	public EmployeeSaveDTO(String employeename, String employeemail, String employeepassword, String mobile) {
		super();
		this.employeename = employeename;
		this.employeemail = employeemail;
		this.employeepassword = employeepassword;
		this.mobile = mobile;
	}

	public EmployeeSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
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
		return "EmployeeSaveDTO [employeename=" + employeename + ", employeemail=" + employeemail
				+ ", employeepassword=" + employeepassword + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
