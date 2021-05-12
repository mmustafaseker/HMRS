package JavaCamp.hrms.business.abstracts;

import java.util.List;

import JavaCamp.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
