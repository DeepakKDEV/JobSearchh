package com.example.jobSearch.JobController;

import com.example.jobSearch.JobModel.JobType;
import com.example.jobSearch.JobModel.Model;
import com.example.jobSearch.JobService.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController

public class JobController{
    @Autowired
    JobService  jobService;

    @PostMapping("job/post")
    public String addJob(@RequestBody @Valid Model newJob)
    {
        return jobService.addJob(newJob);
    }
    @PostMapping("jobs/post")
    public String addJobs(@RequestBody @Valid List<Model> newJobs){
        return jobService.addJobs(newJobs);
    }


}
