package com.9638520.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.9638520.model.JiraSoftware;
import com.9638520.model.User;
import com.9638520.service.JiraSoftwareService;
import com.9638520.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private JiraSoftwareService jiraSoftwareService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/jira/username")
	public JiraSoftware getJiraSoftwareByUsername(String username) {
		return jiraSoftwareService.findByUsername(username);
	}
	
	@GetMapping("/jira/password")
	public JiraSoftware getJiraSoftwareByPassword(String password) {
		return jiraSoftwareService.findByPassword(password);
	}
	
	@GetMapping("/jira/url")
	public JiraSoftware getJiraSoftwareByUrl(String url) {
		return jiraSoftwareService.findByUrl(url);
	}
	
	@GetMapping("/jira/repository")
	public JiraSoftware getJiraSoftwareByRepositoryName(String repositoryName) {
		return jiraSoftwareService.findByRepositoryName(repositoryName);
	}
	
	@PostMapping("/jira/username/delete")
	public void deleteJiraSoftwareByUsername(String username) {
		jiraSoftwareService.deleteByUsername(username);
	}
	
	@PostMapping("/jira/password/delete")
	public void deleteJiraSoftwareByPassword(String password) {
		jiraSoftwareService.deleteByPassword(password);
	}
	
	@PostMapping("/jira/url/delete")
	public void deleteJiraSoftwareByUrl(String url) {
		jiraSoftwareService.deleteByUrl(url);
	}
	
	@PostMapping("/jira/repository/delete")
	public void deleteJiraSoftwareByRepositoryName(String repositoryName) {
		jiraSoftwareService.deleteByRepositoryName(repositoryName);
	}
	
	@PostMapping("/user/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/user/username")
	public User getUserByUsername(String username) {
		return userService.findByUsername(username);
	}
	
	@GetMapping("/user/email")
	public User getUserByEmail(String email) {
		return userService.findByEmail(email);
	}
	
	@GetMapping("/user/username/password")
	public User getUserByUsernameAndPassword(String username, String password) {
		return userService.findByUsernameAndPassword(username, password);
	}
	
	@GetMapping("/user/email/password")
	public User getUserByEmailAndPassword(String email, String password) {
		return userService.findByEmailAndPassword(email, password);
	}
	
	@PostMapping("/user/username/delete")
	public void deleteUserByUsername(String username) {
		userService.deleteByUsername(username);
	}

}