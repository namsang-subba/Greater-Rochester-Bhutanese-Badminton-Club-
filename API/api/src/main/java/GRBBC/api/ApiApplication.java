package GRBBC.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import GRBBC.api.model.Player;
import GRBBC.api.repository.PlayerRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	@Autowired
	private PlayerRepository playerRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("printing player info");
		Player me = playerRepository.findByName("Namsang Subba");
		System.out.println(playerRepository.findAll());
	}

}
