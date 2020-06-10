/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Entites;

/**
 *
 * @author Jasser
 */
public class Enfant {
    private int id ; 
    private String prenom ;
    private String username ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Enfant() {
    }

    @Override
    public String toString() {
        return "Enfant{" + "id=" + id + ", prenom=" + prenom + ", username=" + username + '}';
    }
    
    
    
}
