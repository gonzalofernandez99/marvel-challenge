package com.example.marvel_challenge.persistence.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marvel_challenge.persistence.entity.UserInteractionLog;

public interface UserInteractionLogRepository extends JpaRepository<UserInteractionLog, Long> {

    Page<UserInteractionLog> findByUsername(Pageable pageable, String username);
}