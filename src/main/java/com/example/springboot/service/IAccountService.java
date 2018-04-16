package com.example.springboot.service;

import com.example.springboot.domain.Account;

import java.util.List;

public interface IAccountService {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccoutById(int id);
    List<Account> findAccountList();
}
