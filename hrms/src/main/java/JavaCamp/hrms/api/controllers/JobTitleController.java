package JavaCamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaCamp.hrms.business.abstracts.JobTitleService;
import JavaCamp.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;
	
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
	}
	
}
