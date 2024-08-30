package shop.osx.osxshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import shop.osx.osxshop.services.DatabaseSeederService;

@SpringBootApplication
public class OsxshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsxshopApplication.class, args);
	}

	@Bean // indique de gérer automatiquement les dépendances
	// s'exécuteautomatiquement au démarage de l'api
	public CommandLineRunner demo(DatabaseSeederService databaseSeederService) {
		return (args) -> {
			databaseSeederService.seedDatabase();
		};
	}
}