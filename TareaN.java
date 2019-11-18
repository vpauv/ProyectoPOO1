package Tarea;
import java.io.Serializable;

public abstract class TareaN implements Serializable{
    private final String pendiente ="Pendiente";
    private final String proceso="En proceso";
    private final String terminada="Terminada";
    private final String entregada="Entregada";
    private String estado;
    private String nombreTarea;
    
    public String getEstado(){ return estado; }
    
    public String getNombre(){ return nombreTarea; }
    
    public void cambiarApendiente( ){ estado = pendiente; }
    
    public void cambiarAenProceso( ){ estado = proceso; }
    
    public void cambiarAterminada( ){ estado = terminada; }
    
    public void cambiarAentregada( ){ estado = entregada; }
    
}