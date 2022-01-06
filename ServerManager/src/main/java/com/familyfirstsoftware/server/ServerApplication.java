package com.familyfirstsoftware.server;

import com.familyfirstsoftware.server.enumeration.Status;
import com.familyfirstsoftware.server.model.Server;
import com.familyfirstsoftware.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.161", "Ubuntu Linux", "16 GB", "Personal PC", "http:/localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.876.1.162", "Linux", "16 GB", "Personal PC", "http:/localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.910.1.163", "Mac OS", "8 GB", "Personal PC", "http:/localhost:8080/server/image/server3.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.164", "Tomcat", "64 GB", "Server", "http:/localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}

}
