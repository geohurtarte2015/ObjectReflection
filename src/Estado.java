



import java.io.Serializable;



public class Estado implements Serializable {
    
    
   
    public int idEstado;
    public String descripcion;

    public Estado(){
    
    
    }
    
     public Estado(String descripcion){         
         this.descripcion = descripcion;
    }
    
    
    public int getIdEstado() {
        return idEstado;
    }
    
 
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
