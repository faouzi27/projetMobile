/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Entites;

import java.util.Date;

/**
 *
 * @author Jasser
 */
public class Reservation {
    private int id ; 
    private String enfant ; 
    private int parent ;
    private Date DateGar ;
    private int prix ; 
    private String etat ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnfant() {
        return enfant;
    }

    public void setEnfant(String enfant) {
        this.enfant = enfant;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public Date getDateGar() {
        return DateGar;
    }

    public void setDateGar(Date DateGar) {
        this.DateGar = DateGar;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    
    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", enfant=" + enfant + ", parent=" + parent + ", DateGar=" + DateGar + ", prix=" + prix + ", etat=" + etat + '}';
    }
    
    
}
