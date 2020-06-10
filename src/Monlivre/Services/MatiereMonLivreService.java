/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Categorie;
import Monlivre.Entites.Matieremonlivre;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author FAOUZI
 */
public class MatiereMonLivreService {
    
    public  ArrayList<Matieremonlivre> getListmatiere(Map m, Categorie c){
        ArrayList<Matieremonlivre> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("Matieremonlivre");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Matieremonlivre p = new Matieremonlivre();
            Double ll = (Double) f.get("id");
            Double ld = (Double) f.get("nbheure");
            p.setId(ll.intValue());
            
            
            p.setMatiere((String)f.get("matiere"));
            p.setNomfile((String)f.get("webpath"));
            p.setNbheures(ld.intValue());
            p.setCat(c);
            
            
            
           
           
            
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
