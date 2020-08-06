package tfe.exemple.managerservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tfe.exemple.managerservice.client.EmployeeClient;

@RestController
public class ManagerController {

	@Autowired
	EmployeeClient employeeClient;

	@GetMapping("/managedEmployees")
	public List<String> findManagedEmployees() {
		List<String> managedEmployees = new ArrayList<>();

		for (int i = 0; i < nbOfEmployees(); i++) {
			managedEmployees.add(employeeClient.findRandomEmployee());
		}
		
		return managedEmployees;
	}

	/** 
	 * Retrieves the amount of employees (random number).
	 * @return
	 */
	public int nbOfEmployees() {
		Random rand = new Random();
		int nb = rand.nextInt(8) + 1;
		return nb;
	}
}
