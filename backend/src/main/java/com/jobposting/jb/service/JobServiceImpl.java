//package com.jobpost.talentbridge.service;
package com.jobposting.jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobposting.jb.model.Job;
import com.jobposting.jb.repository.JobRepository;
//import com.jobpost.talentbridge.service.JobService;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepo;

    @Override
    public Job saveJob(Job job) {
        return jobRepo.save(job);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }
}

