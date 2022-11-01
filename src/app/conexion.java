/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author michaelmartinez
 */
public class conexion {
    
    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String DB = "Funcionario";
    private final String USER = "postgres";
    private final String PASSWORD = "Michael1908";
    
    public Connection getConexion(){
        Connection conn = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://"+HOST+":"+PUERTO+"/"+DB;
            conn = DriverManager.getConnection(url,USER,PASSWORD);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }      
        return conn;
    }
    
    
}
