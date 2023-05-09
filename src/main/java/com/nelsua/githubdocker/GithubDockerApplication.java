package com.nelsua.githubdocker;

import com.nelsua.githubdocker.entity.UserEntity;
import com.nelsua.githubdocker.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
public class GithubDockerApplication {
	@Autowired
	private Repo repo;
	@PostMapping(value="/newUser")
	public void createUser(@RequestBody UserEntity user) {
		UserEntity sevedUser=repo.save(user);
	}

	@GetMapping("/users")
	public @ResponseBody List<UserEntity> getUsers(){
		return repo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubDockerApplication.class, args);
	}
}
