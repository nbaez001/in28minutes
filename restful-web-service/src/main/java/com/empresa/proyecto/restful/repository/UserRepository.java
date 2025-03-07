package com.empresa.proyecto.restful.repository;

import com.empresa.proyecto.restful.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
