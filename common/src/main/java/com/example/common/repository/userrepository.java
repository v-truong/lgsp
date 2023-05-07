package com.example.common.repository;

import com.example.common.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<user,Long> {
}
