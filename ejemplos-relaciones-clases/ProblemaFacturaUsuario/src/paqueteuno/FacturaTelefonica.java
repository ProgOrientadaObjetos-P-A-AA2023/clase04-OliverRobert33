package paqueteuno;

import paquetedos.Usuario;

public class FacturaTelefonica {

    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;
    private Usuario usuario;

    public FacturaTelefonica(String num, double minutos, double valorMin,
            Usuario u) {
        numeroTelefono = num;
        minutosMes = minutos;
        valorMinuto = valorMin;
        usuario = u;
    }

    public void establecerNumeroTelefono(String c) {
        numeroTelefono = c;
    }

    public void establecerMinutosMes(double c) {
        minutosMes = c;
    }

    public void establecerValorMinuto(double c) {
        valorMinuto = c;
    }

    public void establecerUsuario(Usuario u) {
        usuario = u;
    }

    // public void establecerValorFactura(){
    public void calcularValorFactura() {
        valorFactura = minutosMes * valorMinuto;
    }

    public String obtenerNumeroTelefono() {
        return numeroTelefono;
    }

    public double obtenerMinutosMes() {
        return minutosMes;
    }

    public double obtenerValorMinuto() {
        return valorMinuto;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public Usuario obtenerUsuario() {
        return usuario;
    }

    @Override
    public String toString() {

        String cadena = String.format(""
                + "Factura de Teléfono\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Número de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n"
                + "Valor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                usuario.obtenerNombre(),
//                obtenerUsuario().obtenerNombre(),
                obtenerUsuario().obtenerApellido(),
                obtenerUsuario().obtenerIdentificacion(),
                obtenerNumeroTelefono(),
                obtenerMinutosMes(),
                obtenerValorMinuto(),
                obtenerValorFactura());
        return cadena;
    }

}
