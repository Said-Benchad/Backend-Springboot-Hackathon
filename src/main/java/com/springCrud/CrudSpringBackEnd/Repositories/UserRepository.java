package com.springCrud.CrudSpringBackEnd.Repositories;

import com.springCrud.CrudSpringBackEnd.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   // User findByEmail(String email);

    public Optional<User> findByUsername(String username);
    public Optional<User> findUserById(long id);

    public Optional<User> findByEmail(String email);

}
