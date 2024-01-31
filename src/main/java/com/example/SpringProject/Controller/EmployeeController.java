package com.example.SpringProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProject.DTO.Contact;
import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.DTO.EmployeeSaveDTO;
import com.example.SpringProject.DTO.EmployeeUpdateDTO;
import com.example.SpringProject.Entity.Employee;
import com.example.SpringProject.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path="/save")
	public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO)
	{
		String id=employeeService.addEmployee(employeeSaveDTO);
		return id;
		
	}
	
	@GetMapping(path="/getAllEmployee")
	public List<EmployeeDTO> getAllEmployee()
	{
		List<EmployeeDTO> allEmployees=employeeService.getAllEmployee();
		return allEmployees;
	}
	
	@GetMapping(path="/getOneEmployee/{id}")
	public Employee getOneEmployee(@PathVariable(value="id")int id)
	{
		Employee emp =employeeService.getOneEmployee(id);
		return emp;
	}
	
	
	
	@PutMapping(path="/update")
	public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO)
	{
		String id=employeeService.updateEmployee(employeeUpdateDTO);
		return id;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String deleteEmployee(@PathVariable(value="id")int id)
	{
		boolean deleteEmployee=employeeService.deleteEmployee(id);
		return "Deleted successfully";
	}
	
	@GetMapping(path="/login/{email}/{password}")
	public Employee loginCheck(@PathVariable String email,@PathVariable String password)
	{
		Employee emp = employeeService.checkLogin(email, password);
		
		if (emp != null) {
            return emp;
        } else {
            return null;
        }
		
	}
	
	@PostMapping("/contact")
	public Contact contactData(@RequestBody Contact contact)
	{
		Contact contact1=employeeService.createContact(contact);
		return contact1;
	}
}
