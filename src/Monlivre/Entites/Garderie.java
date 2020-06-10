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
public class Garderie {
    private int id ; 
    private String nom ; 
    private Double note ; 

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

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Garderie() {
    }

    @Override
    public String toString() {
        return "Garderie{" + "id=" + id + ", nom=" + nom + ", note=" + note + '}';
    }
    
    
    
}
