package com.example.SpringProject.Service;

import java.util.List;
import java.util.Optional;

import com.example.SpringProject.DTO.Contact;
import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.DTO.EmployeeSaveDTO;
import com.example.SpringProject.DTO.EmployeeUpdateDTO;
import com.example.SpringProject.Entity.Employee;

public interface EmployeeService {

	public String addEmployee(EmployeeSaveDTO employeeSaveDTO);

	public List<EmployeeDTO> getAllEmployee();
	
	public Employee getOneEmployee(int id);

	public String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO);

	public boolean deleteEmployee(int id);
	
	public Employee checkLogin(String email, String password);
	
	public Contact createContact(Contact contact);

}
