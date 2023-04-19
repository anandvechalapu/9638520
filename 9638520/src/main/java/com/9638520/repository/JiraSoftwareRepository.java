package com.9638520.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraSoftwareRepository extends JpaRepository<JiraSoftware, Long> {
 
    JiraSoftware findByUsername(String username);
    JiraSoftware findByPassword(String password);
    JiraSoftware findByUrl(String url);
    JiraSoftware findByRepositoryName(String repositoryName);
    void deleteByUsername(String username);
    void deleteByPassword(String password);
    void deleteByUrl(String url);
    void deleteByRepositoryName(String repositoryName);
}