
package paqueteuno;
import paquetedos.Usuario;

public class Ejecutor {
    public static void main(String[] args) {
        // Crear el objeto Usuario
        Usuario usuario = new Usuario();

        usuario.establecerNombre("María");
        usuario.establecerApellido("Paute");
        usuario.establecerIdentificacion("111122223");
        
        // Crear el objeto FacturaTelefonica
        FacturaTelefonica factura = new FacturaTelefonica("098763211", 100, 
                0.5, usuario);
        
        factura.calcularValorFactura();
        System.out.printf("%s\n", factura);

    }
}
