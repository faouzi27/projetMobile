/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Entites;

/**
 *
 * @author FAOUZI
 */
public class Matieremonlivre {
    private int id ;
    private String matiere ;
    private int nbheures ;
    private Categorie cat ;
    private String nomfile ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getNbheures() {
        return nbheures;
    }

    public void setNbheures(int nbheures) {
        this.nbheures = nbheures;
    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public String getNomfile() {
        return nomfile;
    }

    public void setNomfile(String nomfile) {
        this.nomfile = nomfile;
    }

    public Matieremonlivre() {
    }

    @Override
    public String toString() {
        return "Matieremonlivre{" + "id=" + id + ", matiere=" + matiere + ", nbheures=" + nbheures + ", cat=" + cat + ", nomfile=" + nomfile + '}';
    }
    
    
}
