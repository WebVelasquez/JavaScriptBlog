package controlador;
import modelo.Datos; 
        
public class Principal {
    public static void main(String[] args) {
        
        Datos dc = new Datos();
        
        
        dc.datosCliente();
        dc.mostrarDatos();
    }
}
