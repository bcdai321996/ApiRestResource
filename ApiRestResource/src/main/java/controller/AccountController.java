package controller;

import models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import respository.AccountRepository;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> GetAccount(){
        return ResponseEntity.ok(accountRepository.findAll());
    }
}
