/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Forms;

import Monlivre.Entites.Comment;
import Monlivre.Entites.User;
import static Monlivre.Forms.AddComment.c;
import static Monlivre.Forms.CommentsForm.id;
import Monlivre.Services.ActiviteService;
import Monlivre.Services.CommentService;
import Monlivre.Services.UserService;
import com.codename1.components.ImageViewer;
import com.codename1.components.ScaleImageLabel;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextArea;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.mycompany.myapp.MyApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import util.WebService;

/**
 *
 * @author FAOUZI
 */
public class LoginForm extends BaseForm{
    
    public LoginForm(){
    super("Login", BoxLayout.y());
        
    
            
            Container photos = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            TextField login = new TextField();
            
            login.setHint("Email");
            TextField password = new TextField(TextField.PASSWORD);
            password.setHint("Password");
            
            Button b = new Button("Se connecter");
            
           
            //Label c = new Label("Nombre d'heures : "+e.getNbheures()+"");
            UserService as = new UserService();
            WebService ws = new WebService();
            
           
           
            
            
            photos.add(login);
            photos.add(password);
            photos.add(b);
            add(photos);
            b.addActionListener(e->{
               String st = ws.Login(login.getText(), password.getText());
               if (st.equals("success")) {
                           
                           ArrayList<User> listevents = as.getListCategorie(ws.getUser("http://localhost/Service/GetUser.php?email="+login.getText()));
                           for (User es : listevents) {
                               MyApplication.u = es ;
                               Home h = new Home();
                               h.show();
                               System.out.println(es.getRoles());
                               
                           }
                        } else {
                            Dialog.show("Erreur", "erreur", "Ok", null);
                        }
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
