package com.example.jobSearch.JobController;

import com.example.jobSearch.JobModel.JobType;
import com.example.jobSearch.JobModel.Model;
import com.example.jobSearch.JobService.JobServiceFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/custom")
public class JobCostumeFInder {

  @Autowired
  JobServiceFinder jobService;
    @GetMapping("jobs/jobType/{jobType}")
    public List<Model> getByJobType(@PathVariable JobType jobType) {
        return jobService.getByJobType(jobType);
    }

    @GetMapping("job/salary/{salary}")
    public List<Model> getBySalary(@PathVariable String salary) {
        return jobService.getBySalary(salary);
    }

    @GetMapping("jobs/description/location")
    public List<Model> getByDescOrLocation(@RequestParam String description, @RequestParam String location) {
        return jobService.getByDescOrLocation(description,location);
    }

}
