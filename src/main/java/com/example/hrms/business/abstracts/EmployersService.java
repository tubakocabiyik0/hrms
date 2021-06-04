package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employers;

public interface EmployersService {
	DataResult<Employers> getByEmail(String email);

	Result addEmpployer(Employers employers);

	DataResult getAllEmployers();
}
