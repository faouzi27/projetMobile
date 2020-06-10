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
public class Event {
    
    private int id ; 
    private String titre ;
    private Double rate ;
    private int vote ;
    private String discription ;
    private String dated ;
    private String dateF ;
    private String lieu ;
    private int nbrplace ;
    private int nbrparticipant ;
    private String image ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDated() {
        return dated;
    }

    public void setDated(String dated) {
        this.dated = dated;
    }

    public String getDateF() {
        return dateF;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getNbrplace() {
        return nbrplace;
    }

    public void setNbrplace(int nbrplace) {
        this.nbrplace = nbrplace;
    }

    public int getNbrparticipant() {
        return nbrparticipant;
    }

    public void setNbrparticipant(int nbrparticipant) {
        this.nbrparticipant = nbrparticipant;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    

    public Event() {
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", titre=" + titre + ", rate=" + rate + ", vote=" + vote + ", discription=" + discription + ", dated=" + dated + ", dateF=" + dateF + ", lieu=" + lieu + ", nbrplace=" + nbrplace + ", nbrparticipant=" + nbrparticipant + ", image=" + image + '}';
    }
    
    
    
    
}
