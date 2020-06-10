/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Categorie;
import Monlivre.Entites.Event;
import Monlivre.Entites.Matieremonlivre;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Jasser
 */
public class EventService {
    public  ArrayList<Event> getListsEvents(Map m){
        ArrayList<Event> listDisponibilite = new ArrayList<>();
        ArrayList d = (ArrayList)m.get("Events");
        System.out.println("roooooooooot "+d);
        //Map f =  (Map) d.get(0);
        System.out.println("dddddddddddddd :::::::::"+d.size());

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            Event p = new Event();
            Double ll = (Double) f.get("id");
            Double ld = (Double) f.get("nbrplace");
            Double ldd = (Double) f.get("nbrparticipant");
            //Double idd = (Double) f.get("vote");
            p.setId(ll.intValue());
            p.setNbrplace(ld.intValue());
            p.setNbrparticipant(ldd.intValue());
            
            
            p.setDiscription((String)f.get("discription"));
            p.setImage((String)f.get("image"));
            p.setLieu((String)f.get("lieu"));
            p.setRate((Double) f.get("rate"));
            p.setTitre((String)f.get("titre"));
            //p.setVote(idd.intValue());
            Map map1 = ((Map) f.get("dated"));
            Map map = ((Map) f.get("dateF")) ;
            Date date1 = new Date((((Double)map1.get("timestamp")).longValue()*1000)); 
            Date date = new Date((((Double)map.get("timestamp")).longValue()*1000)); 
            Format formatter = new SimpleDateFormat("yyyy-MM-dd");
            String s = formatter.format(date);
            String s1 = formatter.format(date1);
            p.setDateF(s);
            p.setDated(s1);
            
            
            
           
           
            
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
