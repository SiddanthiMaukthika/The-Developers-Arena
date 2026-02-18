package com.developersarena.ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.developersarena.ecommerce_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
