package com.example.services;


import com.example.models.Account;
import com.example.respository.AccountRepository;
import com.example.services.Interface.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final AccountRepository accountRepository;



    @Override
    public List<Account> GetListAccount() {
        return accountRepository.findAll();
    }
}
