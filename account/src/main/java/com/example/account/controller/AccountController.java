package com.example.account.controller;

import java.util.Optional;

import com.example.account.entity.Account;
import com.example.account.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;


    @PostMapping("/register")
    public ResponseEntity<Account> register(@RequestBody Account account) {

        // Check if account exists
        Optional<Account> accountExists = accountRepository.findByEmail(account.getEmail());
        if(accountExists.isPresent()){
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT); 
        }
    
        // Create account
        try {
            Account _account = accountRepository
                    .save(new Account(account.getFirstName(), account.getLastName(), account.getEmail(), 
                    account.getNumber(), account.getNumber(), account.getPassword()));
            return new ResponseEntity<>(_account, HttpStatus.CREATED);
        } catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login/{email}/{password}")
	public Boolean login(@PathVariable("email") String email, 
            @PathVariable("password") String password) {
                
        // Check if account exists
        Optional<Account> accountExists = accountRepository.findByEmailAndPassword(email, password);
        if(accountExists.isPresent()){
			return true; 
        } else {
            return false;
        }
	}


}
