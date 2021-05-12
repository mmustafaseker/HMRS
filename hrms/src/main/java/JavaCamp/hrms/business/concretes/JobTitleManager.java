package JavaCamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaCamp.hrms.business.abstracts.JobTitleService;
import JavaCamp.hrms.dataAccess.abstracts.JobTitleDao;
import JavaCamp.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao; 
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

}
