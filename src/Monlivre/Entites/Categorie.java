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
public class Categorie {
    private int id ;
    private String nomCat ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nomCat=" + nomCat + '}';
    }

    public Categorie() {
    }
    
    
    
}
