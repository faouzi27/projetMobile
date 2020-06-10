/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Activite;
import Monlivre.Entites.Enfant;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Jasser
 */
public class EnfantService {
    public  ArrayList<Enfant> getListEnfant(Map m){
        ArrayList<Enfant> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("Enfant");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Enfant p = new Enfant();
            Double ll = (Double) f.get("id");
            p.setId(ll.intValue());
          
            p.setPrenom((String)f.get("prenom"));
            p.setUsername((String)f.get("username"));
            
           
           
            
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
