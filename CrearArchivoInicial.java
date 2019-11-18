
package LogIn;
import Desarrollador.Usuario;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearArchivoInicial {
    public static void main(String[] args){
        
        File arcUsuarios = new File("Usuarios.txt");
        FileOutputStream salida = null;
        FileInputStream entrada = null;
        ObjectOutputStream writer = null;
        ObjectInputStream reader = null;
        Administrador admin = null;
        try {
            System.out.print("Escribiendo en archivo");
            arcUsuarios.createNewFile();
            salida = new FileOutputStream(arcUsuarios);
            writer = new ObjectOutputStream(salida);
            //Insertar metodo para crear un nuevo usuario
            admin = new Administrador("nombre", "123");
            writer.writeObject(admin);
            
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(salida != null){
                try {
                    salida.close();
                    if(writer != null){
                        writer.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CrearArchivoInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
     
    }
}
