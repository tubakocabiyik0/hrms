package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobsService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Jobs;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobsService jobservice;

	public JobsController() {
		super();
	}

	@Autowired
	public JobsController(JobsService jobservice) {
		super();
		this.jobservice = jobservice;
	}

	@GetMapping("/getall") // yukarıda belirttiğim alan için bu komut çalışırsa burası çalışacak
	public DataResult<List<Jobs>> getAll() {

     return this.jobservice.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Jobs jobs) {
		return this.jobservice.addJob(jobs);
	}
	
}