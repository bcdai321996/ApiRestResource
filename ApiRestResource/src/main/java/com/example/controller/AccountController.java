package com.example.controller;
import com.example.models.Account;
import com.example.services.Interface.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class AccountController {

   private final IAccountService accountService;

    @GetMapping(value ="/accounts")
    public ResponseEntity<List<Account>> GetAccount(){
        return ResponseEntity.ok().body(accountService.GetListAccount());
    }
}
