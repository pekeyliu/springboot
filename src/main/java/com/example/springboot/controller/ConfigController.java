package com.example.springboot.controller;

import com.example.springboot.javabean.ConfigBean;
import com.example.springboot.javabean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class ConfigController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    UserBean userBean;

    @RequestMapping(value="getConfigInfo")
    public String getConfigInfo(){
        return configBean.getGreetting() + ">>>>" + configBean.getName() + ">>>>>UUID:" + configBean.getUuid() + ">>>>>>value:" +
                configBean.getValue() + ">>>>>>Max:" + configBean.getMax() + ">>>>>number:" +configBean.getNumber();
    }

    @RequestMapping(value = "getUserInfo")
    public String getUserConfig(){
        return "hi," + userBean.getName() + ".your age is " + userBean.getAge();
    }
}
