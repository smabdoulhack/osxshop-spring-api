package shop.osx.osxshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.osx.osxshop.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
