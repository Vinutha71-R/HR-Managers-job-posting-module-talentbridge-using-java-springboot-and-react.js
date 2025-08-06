package com.jobposting.jb.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jobposting.jb.repository.JobRepository;

@Component
public class DBSeeder implements CommandLineRunner {

    private final JobRepository jobRepository;

    public DBSeeder(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void run(String... args) {
        // Only insert if DB is empty
        //jobRepository.deleteAll(); 
           // Job job1 = new Job("Java Developer", "Spring Boot REST APIs", "Bangalore");
            //Job job2 = new Job("Frontend Developer", "React + Tailwind", "Remote");

            //jobRepository.save(job1);
           // jobRepository.save(job2);

            System.out.println("✅ Sample jobs inserted into DB!");
        
    }
}

