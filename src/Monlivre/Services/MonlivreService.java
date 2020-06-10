/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Categorie;
import Monlivre.Entites.Matieremonlivre;
import Monlivre.Entites.MonLivre;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Jasser
 */
public class MonlivreService {
    
    public  ArrayList<MonLivre> getListLivres(Map m, Matieremonlivre c){
        ArrayList<MonLivre> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("Livre");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            MonLivre p = new MonLivre();
            Double ll = (Double) f.get("id");
            
            
            
            p.setDescription((String)f.get("description"));
            p.setNomCour((String)f.get("NomCour"));
            p.setVideo((String)f.get("video"));
            p.setMl(c);
            
            
            
           
           
            
            /**
            e.setTitre((String) f.get("titre"));
            e.setDescription((String) f.get("description"));
            e.setCategorie((String) f.get("categorie"));
            e.setPhoto((String) f.get("photo"));
            e.setDateDebut((Date)f.get("dateDebut"));
            e.setDateFin((Date)f.get("dateFin"));
            //e.setCreatedAt((Date)f.get("createdAt"));
            e.setLieu((String) f.get("lieu"));
            
            e.setNb_max(((Double) f.get("nbMax")).intValue());**/
            listDisponibilite.add(p);  
        }        
        return listDisponibilite;
        
    }
}
