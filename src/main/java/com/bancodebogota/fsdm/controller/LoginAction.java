/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fsdm.controller;

import com.bancodebogota.fdm.dao.LoginDao;
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
   // userDto =new UserDto();
    
     UserDto us =  LoginDao.getInstance().obtenerUsuario(userDto);
        if(us==null){
             return ERROR;
        }else{
            return SUCCESS+"Tiles";
        }
    
  
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
    
    @Override
    public void validate() {

     if (userDto.getName().length() == 0) {
         addFieldError("userDto.name", "Name is required.");
        }
      if (userDto.getPassword().length() == 0) {
         addFieldError("userDto.password","Password is required.");
        }
       }
    
}
