package br.com.laurosantos.springsecurityjwt.repository;

import br.com.laurosantos.springsecurityjwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);
}
