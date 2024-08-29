package shop.osx.osxshop;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import shop.osx.osxshop.models.User;
import shop.osx.osxshop.repositories.UserRepository;

@SpringBootApplication
public class OsxshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsxshopApplication.class, args);
	}

	@Bean // indique de gérer automatiquement les dépendances
	public CommandLineRunner demo(UserRepository userRepository) { // s'exécute automatiquement au démarage de l'api
		return (args) -> {
			// Créer une donnée à l'aide du constructeur de la class
			User abdoulHack = new User(null, "Abdoul Hack", "abdoulhack@gmail.com", "motdepass@123",
					LocalDateTime.now(), LocalDateTime.now());

			// Créer une donnée à l'aide du Builder (souvent utilisé pour les tests en dur)
			User johnDoe = User.builder()
					.email("johndoe@gmail.com")
					.username("John Doe")
					.password("123")
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			// Sauvegarder John Doe dans la basd de données
			userRepository.save(johnDoe);
			userRepository.save(abdoulHack);
		};
	}
}
