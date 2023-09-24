package com.example.jobSearch.JobService;

import com.example.jobSearch.JobModel.JobType;
import com.example.jobSearch.JobModel.Model;
import com.example.jobSearch.JobRepo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    IJobRepo iJobRepo;

    public String addJob(Model newJob) {
        iJobRepo.save(newJob);
        return "added job";
    }

    public String addJobs(List<Model> newJobs) {
        iJobRepo.saveAll(newJobs);
        return "save all jobs query";
    }




/*

    public String deleteByCompanyName(String companyName) {
        List<Model> list = iJobRepo.findByCompanyName(companyName);
        if ( list != null ) {
            iJobRepo.deleteByCompanyName(companyName);
            return "Jobs with company name " + companyName + " deleted successfully";
        }
        else {
            return "Jobs with company name " + companyName + " Cannot be found";
        }
    }

    public String updateSalaryBasedOnId(String id, String salary) {
        Long job_Id = Long.parseLong(id);

        Double job_Salary = Double.parseDouble(salary);

        Optional<Model> list = iJobRepo.findById(job_Id);

        if(list.isPresent()){
            iJobRepo.updateSalaryBasedOnId(job_Id , job_Salary);
            return "Job with job_Id "+job_Id+ " updated successfully";
        }else{
            return "Job with job_Id "+job_Id + " not found";
        }

    }

 */
}
