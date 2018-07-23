package tech.greathouse.spring.microservices.lab1.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tech.greathouse.spring.microservices.lab1.dao.sql.jpa.TeamRepository;
import tech.greathouse.spring.microservices.lab1.model.Team;

//@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepo;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepo.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeamByID(@PathVariable Long id) {
		return teamRepo.findById(id).get();
	}
}
