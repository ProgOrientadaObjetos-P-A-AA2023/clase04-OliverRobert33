
package paquete1;

public class Barrio {
    
    private String nombre;
    
    public Barrio(String n){
        nombre = n;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
}
