/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author leona
 */
public class Conexao {
    public Connection getConecction() throws SQLException{
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/sistema_academia","postgres","admin");
            if(conn!=null){
                System.out.println("Conectado!");
            }else{
                System.out.println("Falha na conexão!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
