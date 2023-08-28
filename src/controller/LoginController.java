/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
    
    public void autenticar(){
        //Buscar usuário no banco
        MenuView telaMenu = new MenuView();
        telaMenu.setVisible(true);
    }
}
