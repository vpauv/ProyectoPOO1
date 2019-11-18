package Desarrollador;
import Tarea.TareaN;
import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
   private String username;
   private String password;
   private String tipoUsuario = "Usuario"; 
   public ArrayList<TareaN> tareasPendientes;
   public ArrayList<TareaN> tareasEnProceso;
   public ArrayList<TareaN> tareasTerminadas;
   public ArrayList<TareaN> tareasEntregadas;
   
   public Usuario(String usr, String pws){
       username = usr;
       password = pws;
   }
   
   public String getUsername(){ return username; }
   public String getTipoUsr(){ return tipoUsuario; }
   public String getPassword(){ return password; }
   public void setTipoUsuario(String tipoNuevo) { tipoUsuario = tipoNuevo; }
   
}