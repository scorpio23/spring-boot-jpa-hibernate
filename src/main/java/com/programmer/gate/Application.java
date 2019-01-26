package com.programmer.gate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Temporal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programmer.gate.model.VpostHicardSendinfo;
import com.programmer.gate.repository.TeamRepository;
import com.programmer.gate.repository.VpostHicardSendinfoRepository;
import com.programmer.gate.service.SoccerService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	SoccerService soccerService;
	
	@Autowired
	private VpostHicardSendinfoRepository vpostRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
		
		List<String> players = soccerService.getAllTeamPlayers(1);
		for(String player : players)
		{
			System.out.println("Introducing Barca player => " + player);
		}
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = simpleDateFormat.parse("25-01-2019"); 
		
		System.out.println("\n\n ***************************** ");
		
		VpostHicardSendinfo vpostHicardSendinfo = vpostRepo.findByloginnameAndDatetimestart("balajiyachachamaneni", date);
		System.out.println("Result findByloginnameAndDatetimestart vpostHicardSendinfo ===========> " + vpostHicardSendinfo);
		
		System.out.println("***************************** ");
		
	}
}