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
public class MonLivre {
    private int id ;
    private String nomCour;
    private String description;
    private String video ;
    private Matieremonlivre ml ;

    public MonLivre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCour() {
        return nomCour;
    }

    public void setNomCour(String nomCour) {
        this.nomCour = nomCour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Matieremonlivre getMl() {
        return ml;
    }

    public void setMl(Matieremonlivre ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "MonLivre{" + "id=" + id + ", nomCour=" + nomCour + ", description=" + description + ", video=" + video + ", ml=" + ml + '}';
    }
    
    
    
    
}
