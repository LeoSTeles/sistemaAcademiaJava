/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
/**
 *
 * @author leona
 */
public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios(usuario,senha,gestor,nome) values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.setBoolean(3, usuario.isGestor());
        statement.setString(4, usuario.getNome());
        
        statement.execute();
    }
    
    public boolean existeNoBanco(String usuario, String senha) throws SQLException{
        String sql = "SELECT * FROM usuarios where usuario = ? and senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, senha);
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        if(resultSet.next()){
            return true;
        }else{
            return false;
        }
    }
}
