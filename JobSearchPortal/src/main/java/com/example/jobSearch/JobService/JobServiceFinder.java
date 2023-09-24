package com.example.jobSearch.JobService;

import com.example.jobSearch.JobModel.JobType;
import com.example.jobSearch.JobModel.Model;
import com.example.jobSearch.JobRepo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceFinder {

    @Autowired
    IJobRepo iJobRepo;
    public List<Model> getByJobType(JobType jobType) {
        return iJobRepo.getByJobType(jobType);
    }

    public List<Model> getBySalary(String salary) {
        double newSalary = Double.parseDouble(salary);
        return iJobRepo.findBySalaryGreaterThan(newSalary);
    }

    public List<Model> getByDescOrLocation(String description, String location) {
        return iJobRepo.findByDescriptionOrLocation(description, location);
    }
}
