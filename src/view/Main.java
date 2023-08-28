/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.sql.Connection;
import model.Usuario;

/**
 *
 * @author leona
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conexao().getConecction();
        
        Usuario usuario = new Usuario("Leo_STeles", "Leonardo10", true, "Leonardo Monte Alegre Sousa Teles");
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        usuarioDAO.inserir(usuario);
    }
}
