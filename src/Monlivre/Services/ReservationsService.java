/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Garderie;
import Monlivre.Entites.Matieremonlivre;
import Monlivre.Entites.MonLivre;
import Monlivre.Entites.Reservation;
import com.mycompany.myapp.MyApplication;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Jasser
 */
public class ReservationsService {
    
     public  ArrayList<Reservation> getListLivres(Map m){
        ArrayList<Reservation> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("reservation");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Reservation p = new Reservation();
            Double ll = (Double) f.get("id");
            
            Double ld = (Double) f.get("prix");
            p.setId(ll.intValue());
            p.setParent(MyApplication.u.getId());
            p.setEtat((String)f.get("etat"));
            p.setPrix(ld.intValue());
             Map map1 = ((Map) f.get("dateGar"));
           Map map2 = ((Map) f.get("nbenfants"));
           p.setEnfant((String)map2.get("prenom"));
            Date date1 = new Date((((Double)map1.get("timestamp")).longValue()*1000)); 
            
            Format formatter = new SimpleDateFormat("yyyy-MM-dd");
            String s = formatter.format(date1);
            p.setDateGar(date1);
            
            
            
           
           
            
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
     public  ArrayList<Garderie> getListGarderie(Map m){
        ArrayList<Garderie> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("garderie");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Garderie p = new Garderie();
            Double ll = (Double) f.get("id");
            
            Double ld = (Double) f.get("note");
            p.setId(ll.intValue());
            p.setNote(ld);
            p.setNom((String) f.get("nom"));
            
            
            
            
            
           
           
            
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
