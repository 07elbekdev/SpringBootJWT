package com.example.springbootjwt.repository;

import com.example.springbootjwt.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);

    @Override
    <S extends Users> S save(S entity);

    @Override
    Optional<Users> findById(Long id);
    @Override
    void deleteById(Long id);
}