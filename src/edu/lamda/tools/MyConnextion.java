/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lamda.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arfaoui
 */
public class MyConnextion {
    
     String url="jdbc:mysql://localhost:3306/test";
    String login="root";
    String pwd="";
    Connection cnx;
    public static MyConnextion instance;

    private MyConnextion()  {
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("connextion etablie");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnextion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MyConnextion getInstance()
    {
        if (instance == null){
            instance = new MyConnextion();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
    
}
