package shop.osx.osxshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import shop.osx.osxshop.models.User;
import shop.osx.osxshop.repositories.UserRepository;

@Service
public class DatabaseSeederService {

    @Autowired
    UserRepository userRepository;

    private final Faker faker = new Faker();

    public void seedDatabase() {
        // créer des users factices
        for (int i = 0; i < 10; i++) {
            String username = faker.name().username();
            String email = username + "@example.com"; // faker.internet().emailAddress()
            String password = faker.internet().password();

            User user = User.builder()
                    .email(email)
                    .username(username)
                    .password(password)
                    .build();

            userRepository.save(user);
        }
    }

}
