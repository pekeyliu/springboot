package com.example.springboot.controller.JDBC;

import com.example.springboot.domain.Account;
import com.example.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id){
        return accountService.findAccoutById(id);
    }

    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name",required = true) String name,
                                @RequestParam(value = "money",required = true) double money){
        return "";
    }

}
