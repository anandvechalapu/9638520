package com.9638520.service;

import com.9638520.repository.JiraSoftwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraSoftwareService {
    
    @Autowired
    private JiraSoftwareRepository jiraSoftwareRepository;

    public JiraSoftware findByUsername(String username) {
        return jiraSoftwareRepository.findByUsername(username);
    }

    public JiraSoftware findByPassword(String password) {
        return jiraSoftwareRepository.findByPassword(password);
    }

    public JiraSoftware findByUrl(String url) {
        return jiraSoftwareRepository.findByUrl(url);
    }

    public JiraSoftware findByRepositoryName(String repositoryName) {
        return jiraSoftwareRepository.findByRepositoryName(repositoryName);
    }

    public void deleteByUsername(String username) {
        jiraSoftwareRepository.deleteByUsername(username);
    }

    public void deleteByPassword(String password) {
        jiraSoftwareRepository.deleteByPassword(password);
    }

    public void deleteByUrl(String url) {
        jiraSoftwareRepository.deleteByUrl(url);
    }

    public void deleteByRepositoryName(String repositoryName) {
        jiraSoftwareRepository.deleteByRepositoryName(repositoryName);
    }

}