package tfe.exemple.employeeservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeRepository {
	List<String> employeesNames = new ArrayList<String>(
			Arrays.asList("Jean", "Pierre", "Marc", "Thibault", "Steven", "Donovan"));

	@PostMapping("/list")
	public void addEmployee(@RequestBody String employeeName) {
		employeesNames.add(employeeName);
	}
	
	@GetMapping("/list")
	public List<String> findEmployeesNames(){
		return employeesNames;
	}
	
	@GetMapping("/random")
	public String findRandomEmployee() {
		Random rand = new Random();
		int index = rand.nextInt(employeesNames.size());
		return employeesNames.get(index);
	}
}


