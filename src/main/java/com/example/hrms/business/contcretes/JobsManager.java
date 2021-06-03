package com.example.hrms.business.contcretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobsService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccesResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobsDao;
import com.example.hrms.entities.concretes.Jobs;

@Service
public class JobsManager implements JobsService {

	private JobsDao jobsDao;
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}


	@Override
	public DataResult<List<Jobs>> getAll() {
		
		return new SuccessDataResult<List<Jobs>>(this.jobsDao.findAll(),"jobs fetched");
	}


	@Override
	public Result addJob(Jobs job) {
		// TODO Auto-generated method stub
		return new SuccesResult("job title added");
	}

	
}
