package com.security.basic.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // Metodo que nos permitira iniciar sesion en el <<loadByUsername>>
    Optional<User> findByEmail(String email);

}
