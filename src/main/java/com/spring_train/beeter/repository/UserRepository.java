package com.spring_train.beeter.repository;

import com.spring_train.beeter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByUserName(String username);
}
