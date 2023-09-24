package com.example.jobSearch.JobModel;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class Model {

    @Id
    private Long id;
    @NotBlank
    private String title;

    private String description;
    private String location;
    @Min(value = 20000, message = "Salary must be greater than or equal to 20000")
    private Double salary;
    @Email(message = "not right")
    private String companyEmail;
    @NotBlank
    private String companyName;
    @NotBlank
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType  jobType;
    private LocalDate appliedDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public JobType getJobType() {
        return jobType;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }
}
