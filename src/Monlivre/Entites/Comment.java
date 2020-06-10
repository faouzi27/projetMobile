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
public class Comment {
    
    private int id ; 
    private String commentaire ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", commentaire=" + commentaire + '}';
    }
    
    
    
}
