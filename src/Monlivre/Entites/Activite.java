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
public class Activite {
    private int id ; 
    private String Type ;
    private int prix ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Activite() {
    }

    @Override
    public String toString() {
        return "Activite{" + "id=" + id + ", Type=" + Type + ", prix=" + prix + '}';
    }
    
    
    
    
    
}
