/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fsdm.controller;

import com.bancodebogota.fdm.login.dto.UserDto;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author corre_000
 */
public class LoginAction extends ActionSupport {
    
    private UserDto userDto;
    
    @Override
    public String execute(){
    userDto =new UserDto();
    
    return SUCCESS;
    }
    
}
