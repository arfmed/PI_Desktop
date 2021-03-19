/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lamda.entities;

/**
 *
 * @author arfaoui
 */
public class client {
    private int id;
    private String nom;
    private String mail;
    private String password;

    public client() {
    }

    public client(int id, String nom, String mail, String password) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "client{" + "id=" + id + ", nom=" + nom + ", mail=" + mail + ", password=" + password + '}';
    }
    
    
    
    
}
