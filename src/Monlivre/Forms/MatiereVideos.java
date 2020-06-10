/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monlivre.Forms;

import Monlivre.Entites.Matieremonlivre;
import Monlivre.Entites.MonLivre;
import static Monlivre.Forms.MatieremonlivreForm.c;
import Monlivre.Services.MatiereMonLivreService;
import Monlivre.Services.MonlivreService;
import com.codename1.components.ImageViewer;
import com.codename1.components.MediaPlayer;
import com.codename1.components.ScaleImageLabel;
import com.codename1.io.Log;
import com.codename1.media.Media;
import com.codename1.media.MediaManager;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.URLImage;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import util.WebService;

/**
 *
 * @author FAOUZI
 */
public class MatiereVideos extends BaseForm{
    public static Matieremonlivre ml ;
    Form f ;
    public MatiereVideos(){
    f = new Form(ml.getMatiere(), new BorderLayout());
    f.getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e -> {
        MatiereMonlivredetails.e = ml;
            MatiereMonlivredetails m = new MatiereMonlivredetails();
            m.show();
        });
             WebService ws = new WebService();
    MonlivreService ds = new MonlivreService();
    Map x = ws.getResponse("listLivre/"+ml.getId());
    ArrayList<MonLivre> listevents = ds.getListLivres(x,ml);
             for (MonLivre e : listevents) {
            
            
            
 
               
            
        
           
             String file = (String)"C:/wamp/www/EcoleF/web/uploads/"+e.getVideo();
                try {
                    Media video = MediaManager.createMedia(file, true);
                   f.removeAll();
                    f.add(BorderLayout.CENTER, new MediaPlayer(video));
                    revalidate();
                } catch(IOException err) {
                    Log.e(err);
                } 
           
        }
        f.show();
    }
    
    
}
