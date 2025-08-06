package com.jobposting.jb.service;

import java.util.List;

import com.jobposting.jb.model.Job;

public interface JobService {
    Job saveJob(Job job);
    List<Job> getAllJobs();
}
