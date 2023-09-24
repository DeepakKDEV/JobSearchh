package com.example.jobSearch.JobController;

import com.example.jobSearch.JobService.JobServiceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobCostumeQuery {
    @Autowired
    JobServiceQuery jobCostumeQuery;


    @DeleteMapping("job/id/{id}")
    public String deleteByCompany(@PathVariable Long id)
    {
        return jobCostumeQuery.deleteByCompany(id);
    }

    @PutMapping("job/id/{id}/jobSalary")
    public String updateJbById(@PathVariable Long id,@RequestParam double jobSalary)
    {
        return jobCostumeQuery.updateJbyId(id,jobSalary);
    }

}
