package com.example.jobSearch.JobRepo;

import com.example.jobSearch.JobModel.JobType;
import com.example.jobSearch.JobModel.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Model, Long> {


    List<Model> getByJobType(JobType jobType);


    List<Model> findBySalaryGreaterThan(double newSalary);

    List<Model> findByDescriptionOrLocation(String description, String location);


     void deleteBycompanyName(String companyName);
}
