/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leona
 */
public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private boolean gestor;

    public Usuario(int id, String nome, String senha, boolean gestor) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.gestor = gestor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isGestor() {
        return gestor;
    }

    public void setGestor(boolean gestor) {
        this.gestor = gestor;
    }
    
    
}
