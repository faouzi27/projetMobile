/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Activite;
import Monlivre.Entites.Categorie;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Jasser
 */
public class ActiviteService {
    
     public  ArrayList<Activite> getListActivite(Map m){
        ArrayList<Activite> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("activite");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Activite p = new Activite();
            Double ll = (Double) f.get("id");
            p.setId(ll.intValue());
            Double ld =(Double) f.get("prix");
            p.setPrix(ld.intValue());
            
            p.setType((String)f.get("type"));
            
           
           
            
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
