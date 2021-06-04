package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployersService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employers;
import com.example.hrms.entities.concretes.Jobs;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {

	private EmployersService employersService;

	@Autowired
	public EmployersControllers(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	

	@GetMapping("/getall") // yukarıda belirttiğim alan için bu komut çalışırsa burası çalışacak
	public DataResult<List<Employers>> getAll() {

     return this.employersService.getAllEmployers();
	}
	
	@GetMapping("/getByEmail")
	public DataResult<Employers> getByEmail(String email){
		return this.employersService.getByEmail(email);
		
	}
	
	@PostMapping("/add")
	public Result addEmployers(Employers employers) {
	 return this.employersService.addEmpployer(employers);
		
	}
	
}
