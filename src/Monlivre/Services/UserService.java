/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Services;

import Monlivre.Entites.Categorie;
import Monlivre.Entites.User;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author FAOUZI
 */
public class UserService {
    
    public  ArrayList<User> getListCategorie(Map m){
        ArrayList<User> listDisponibilite = new ArrayList<>();
        System.out.println(m.get("user"));
        ArrayList d = new ArrayList<>();
        d.add(m.get("user"));
        
        //Map f =  (Map) d.get(0);
        

        for(int i = 0; i<d.size();i++){
            Map f =  (Map) d.get(i);
            User p = new User();
            String ll = (String) f.get("id");
            p.setId(Integer.parseInt(ll));
            
            
            p.setPrenom((String)f.get("prenom"));
            p.setUsername((String)f.get("username"));
            p.setEmail((String)f.get("email"));
            
            if(((String)f.get("roles")).length() == 29){
            p.setRoles(getRoleParent((String)f.get("roles")));
            }
            if(((String)f.get("roles")).length() == 32){
            p.setRoles(getRoleApprenantn((String)f.get("roles")));
            }
            
            
           
           
            
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
    public static String getRoleParent(String array){
        String s = array.substring(15, 26);
        return s ;
    }
    public static String getRoleApprenantn(String array){
        String s = array.substring(15, 29);
        return s ;
    }
    
}
