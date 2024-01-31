package com.example.SpringProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringProject.DTO.Contact;
import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.DTO.EmployeeSaveDTO;
import com.example.SpringProject.DTO.EmployeeUpdateDTO;
import com.example.SpringProject.Entity.ContactUs;
import com.example.SpringProject.Entity.Employee;
import com.example.SpringProject.Repo.ContactRepo;
import com.example.SpringProject.Repo.EmployeeRepo;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String addEmployee(EmployeeSaveDTO employeeSaveDTO) 
	{
		
		Employee employee=new Employee(
				employeeSaveDTO.getEmployeename(),
				employeeSaveDTO.getEmployeemail(),
				employeeSaveDTO.getEmployeepassword(),
				employeeSaveDTO.getMobile()
				);
		employeeRepo.save(employee);
		return employee.getEmployeename();
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> getEmployees=employeeRepo.findAll();
		List<EmployeeDTO> employeeDTOList=new ArrayList<>();
		
		for(Employee e:getEmployees)
		{
			EmployeeDTO employeeDTO=new EmployeeDTO(
					e.getEmployeid(),
					e.getEmployeename(),
					e.getEmployeemail(),
					e.getEmployeepassword(),
					e.getMobile());
			employeeDTOList.add(employeeDTO);
		}
		return employeeDTOList;
	}

	@Override
	public String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO) {
		// TODO Auto-generated method stub
		
		System.out.println("Employee id:"+employeeUpdateDTO.getEmployeeid());
		
		if(employeeRepo.existsById(employeeUpdateDTO.getEmployeeid()))
		{
			Employee employee=employeeRepo.getById(employeeUpdateDTO.getEmployeeid());
			
			employee.setEmployeename(employeeUpdateDTO.getEmployeename());
			employee.setEmployeemail(employeeUpdateDTO.getEmployeemail());
			employee.setEmployeepassword(employeeUpdateDTO.getEmployeepassword());
			employee.setMobile(employeeUpdateDTO.getMobile());
			
			employeeRepo.save(employee);
		}
		else
		{
			System.out.print("Employee id is not found");
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		if(employeeRepo.existsById(id))
		{
			employeeRepo.deleteById(id);
		}
		else
		{
			System.out.print("Employee ID not found");
		}
		return true;
	}

	
	@Override
	public Employee getOneEmployee(int id) {
		Employee employee = employeeRepo.findById(id).get();
		
		return employee;
	}

	@Override
	public Employee checkLogin(String email, String password) {
		Employee emp = employeeRepo.findByEmployeemailAndEmployeepassword(email, password);
		return emp;
	}
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public Contact createContact(Contact contact) {
		
		ContactUs contactUs=new ContactUs(
				contact.getName(),
				contact.getEmail(),
				contact.getMessage()
				);
		ContactUs contactUssaved=contactRepo.save(contactUs);
		Contact con=new Contact(
				contactUssaved.getId(),
				contactUssaved.getName(),
				contactUssaved.getEmail(),
				contactUssaved.getMessage()
				);
		
		return con;
		
	}

}
