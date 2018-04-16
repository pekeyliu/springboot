package com.example.springboot.dao;

import com.example.springboot.domain.Account;

import java.util.List;

public interface IAccountDao {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();
}
