/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author leona
 */
public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
    public void autenticar() throws SQLException{
        //Buscar usuário no banco
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjTextFieldSenha().getText();
        
        Connection conexao = new Conexao().getConecction();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        boolean existe = usuarioDAO.existeNoBanco(usuario, senha);
        if(existe){
            MenuView telaMenu = new MenuView();
            telaMenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
        
        
    }
}
