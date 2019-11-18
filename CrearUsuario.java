
package LogIn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CrearUsuario {
    public void Crear(String user, String pwd){
        File archivo;//para manipular el archivo
        FileWriter escribir; //Para escribir en el archivo
        PrintWriter linea; //Paraescribir en el archivo 
        archivo = new File("usuarios.txt");//preparando al archivo
        if(archivo.exists()){
            try {
                JOptionPane.showMessageDialog(null, "se va a escribir");
                String usuario = user;
                String contraseña = pwd;
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Escribir en el archivo
                linea.println("\n"+usuario);
                linea.println(contraseña);
                linea.close();
                escribir.close();
         
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
