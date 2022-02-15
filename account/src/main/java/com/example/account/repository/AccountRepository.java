package com.example.account.repository;


import java.util.Optional;

import com.example.account.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
   
    Optional<Account> findByEmail(String email);
    Optional<Account> findByEmailAndPassword(String email, String password);
    
}
