package LogIn;

import Desarrollador.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Validar {
    String res;
    
    public void validarUsuario(ArrayList<Usuario> usuarios,String user,String pwd){
        boolean encontrado = false;
        for(Usuario usr : usuarios){
            if(usr.getUsername().equalsIgnoreCase(user) && usr.getPassword().equals(pwd)){
                res = "Bienvenido " + usr.getUsername();
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                if(usr.getTipoUsr().equalsIgnoreCase("Admin")){
                    Frm_Admin ventana = new Frm_Admin();
                    ventana.setVisible(true);
                    //ventana.usrActual = usr;
                }
                else{
                
                    Frm_user ventana = new Frm_user();
                    ventana.setVisible(true);
                    ventana.usrActual = usr;
                    
                }
                break;
            }
        }
        if(encontrado==false){
            res="usuario y/o contraseña erroneos";
            JOptionPane.showMessageDialog(null, res, "inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
