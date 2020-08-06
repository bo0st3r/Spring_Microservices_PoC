package tfe.exemple.managerservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("employee-service")
public interface EmployeeClient {
	
	@GetMapping("/random")
	public String findRandomEmployee();
}


