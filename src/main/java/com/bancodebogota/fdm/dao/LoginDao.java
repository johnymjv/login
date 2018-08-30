/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.dao;

import com.bancodebogota.fdm.listener.SimpleDataSource;
import static com.bancodebogota.fdm.listener.SimpleDataSource.setupDataSource;
import com.bancodebogota.fdm.login.dto.UserDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/**
 *
 * @author Johny Jimenez
 */
public class LoginDao {
    
    
    
    
    private static LoginDao loginDao = null;

    private LoginDao(){}
    
    public static LoginDao getInstance(){
        if(loginDao==null){
            loginDao = new LoginDao();
        }
        return loginDao;
    }
    
    public UserDto obtenerUsuario(UserDto userDto){
    
        String query ="select name, login, password, email from users where login = " 
                + userDto.getLogin() + " and password = " + userDto.getPassword();
    
        
        DataSource dataSource = setupDataSource("jdbc:mysql://localhost:3306/sample?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "conchita");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {

            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            rset = stmt.executeQuery(query);
           

            if(rset.next()) {
                userDto.setEmail(rset.getString("email"));
                userDto.setName(rset.getString("name"));
            }else{
                return null;
            }
        } catch(SQLException e) {
        } finally {
            try { if (rset != null) rset.close(); } catch(SQLException e) { }
            try { if (stmt != null) stmt.close(); } catch(SQLException e) { }
            try { if (conn != null) conn.close(); } catch(SQLException e) { }
        }
        
        return userDto;
    }
    
}
