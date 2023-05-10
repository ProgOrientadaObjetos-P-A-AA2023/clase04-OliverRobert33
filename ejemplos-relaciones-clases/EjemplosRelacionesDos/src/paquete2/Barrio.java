
package paquete2;

public class Barrio {
    
    private String nombre;
    private Ciudad ciudad;
    
    public Barrio(String n, Ciudad c){
        nombre = n;
        ciudad = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
}
