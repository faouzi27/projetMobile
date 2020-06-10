/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Forms;

import Monlivre.Entites.User;
import Monlivre.Services.UserService;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.mycompany.myapp.MyApplication;
import java.util.ArrayList;
import util.WebService;

/**
 *
 * @author Jasser
 */
public class Home extends BaseForm{

public Home(){
    super("Home", BoxLayout.y());
        getToolbar().addMaterialCommandToRightBar("", FontImage.MATERIAL_NOTIFICATIONS, e -> {
            NotificationForm r = new NotificationForm();
            r.show();
        });
    
            
            Container photos = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            
            
            Button b = new Button("Evenements");
            Button a = new Button("Activités");
            Button c = new Button("Matieres");
            Button r = new Button("Reservations");
            Button g = new Button("Garderies");
            Button en = new Button("Ajouter Enfants");
           
            //Label c = new Label("Nombre d'heures : "+e.getNbheures()+"");
            UserService as = new UserService();
            WebService ws = new WebService();
            
           
           int count = ws.getcount("count/"+MyApplication.u.getId());
            
            
           if (count > 0){
               Dialog.show("Notification", "Vous avez "+count+" Notifications", "Ok", null);
           }
           photos.add(a);
            photos.add(b);
            photos.add(c);
            photos.add(r);
            photos.add(g);
            if(MyApplication.u.getRoles().equals("ROLE_PARENT")){
              photos.add(en);  
            }
            add(photos);
            a.addActionListener(e->{
                ListActiviteForm cf = new ListActiviteForm();
               cf.show();
               
            });
             en.addActionListener(e->{
                AddEnfant cf = new AddEnfant();
               cf.show();
               
            });
            c.addActionListener(e->{
               CategorieForm cf = new CategorieForm();
               cf.show();
               
            });
            b.addActionListener(e->{
               ListeEvents cf = new ListeEvents();
               cf.show();
               
            });
            r.addActionListener(e->{
               ReservationListForm cf = new ReservationListForm();
               cf.show();
               
            });
            g.addActionListener(e->{
               ListGarderieForm cf = new ListGarderieForm();
               cf.show();
               
            });
            /**c.addPointerPressedListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt) {
                    WebService ws = new WebService();
                    String status = ws.getStatus("check/"+6+"/"+e.getId());
                    if(status.equals("subscribed")){
                        MatiereVideos.ml = e ;
                        System.out.println(e.getId());
                        MatiereVideos m = new MatiereVideos();
                        m.f.show();
                    }else{
                        
                    }

                }
            });**/
           
      
        show();
        
       
        
        
    }
}    

