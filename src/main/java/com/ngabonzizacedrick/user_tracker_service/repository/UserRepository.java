package com.ngabonzizacedrick.user_tracker_service.repository;

import com.ngabonzizacedrick.user_tracker_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
