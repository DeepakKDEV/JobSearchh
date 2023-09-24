package com.example.jobSearch.JobService;

import com.example.jobSearch.JobModel.Model;
import com.example.jobSearch.JobRepo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceQuery {
    @Autowired
    IJobRepo iJobRepo;

    public String deleteByCompany(Long id) {
        iJobRepo.deleteById(id);
        return "delete id";
    }

    public String updateJbyId(Long id, double jobSalary) {
       Model  JobModel = iJobRepo.findById(id).orElse(null);
        if(JobModel != null)
        {
           JobModel.setSalary(jobSalary);
            iJobRepo.save(JobModel);
            return "salary updated!!";
        }
        else {
            return " not found!";
        }
    }
}
