package com.example.login.service;

import com.example.login.model.JobPost;
import com.example.login.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobPostServiceImpl  implements JobPostService {

        @Autowired
        private JobPostRepository jobPostRepository;



        @Override
        public void saveUser(JobPost jobPost) {
                jobPostRepository.save(jobPost);

        }
}
