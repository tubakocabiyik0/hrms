package com.example.hrms.business.contcretes;

import java.util.List;
import java.util.Objects;

import com.example.hrms.business.abstracts.EmployersService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccesResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployersDao;
import com.example.hrms.entities.concretes.Employers;

public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;

	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	private boolean checkIfEmailExists(String email) {
		if (this.employersDao.findByEmail(email) != null) {
			return false;
		}
		return true;
	}

	private boolean checkPassword(String password) {
		if (password.length() >= 6) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validationForEmployer(Employers employer) {
		if (Objects.isNull(employer.getCompony_name()) || Objects.isNull(employer.getWebsite_url())
				|| Objects.isNull(employer.getMail()) || Objects.isNull(employer.getPhone())
				|| Objects.isNull(employer.getPassword())) {
			return false;
		}

		return true;
	}

	@Override
	public Result addEmpployer(Employers employers) {
		if (checkIfEmailExists(employers.getMail()) && checkPassword(employers.getPassword())
				&& validationForEmployer(employers)) {
			return new SuccesResult("employer added");
		}
		return new ErrorResult("employer didnt add");
	}

	@Override
	public DataResult<List<Employers>> getAllEmployers() {

		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(), "data fetched");

	}

}
