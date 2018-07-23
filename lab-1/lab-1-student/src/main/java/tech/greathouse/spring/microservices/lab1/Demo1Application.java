package tech.greathouse.spring.microservices.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.greathouse.spring.microservices.lab1.dao.sql.jpa.TeamRepository;
import tech.greathouse.spring.microservices.lab1.model.Player;
import tech.greathouse.spring.microservices.lab1.model.Team;

@SpringBootApplication
public class Demo1Application {

	@Autowired
	private TeamRepository teamRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));
	  	
		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington","Generals",null));

		teamRepo.saveAll(list);
	} 
}
