package modelo;
import javax.swing.JOptionPane;

public class Datos {
    Cliente c = new Cliente();
   
    
    public void datosCliente(){
        String nombre,apellido;
        String dui,nit;
        String numCuenta;
        double monto;
        
        
        nombre = JOptionPane.showInputDialog(null, "Nombres del cliente");
        apellido = JOptionPane.showInputDialog(null, "Apellidos del cliente");
        dui = JOptionPane.showInputDialog(null, "ingrese su numero de identidad (DUI)");
        nit = JOptionPane.showInputDialog(null, "ingrese su NIT");
        numCuenta = JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta");
        monto = Double.parseDouble(JOptionPane.showInputDialog(null,"monto de la cuenta "));
        
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setDui(dui);
        c.setNit(nit);
        c.setNumCuenta(numCuenta);
        c.setMonto(monto);
        JOptionPane.showMessageDialog(null, "Buscando datos del cliente.......");
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Cliente  =>"+c.getNombre()+ " " +c.getApellido()+
                                    "\n DUI =>" +c.getDui()+
                                    "\n NIT =>" +c.getNit()+
                                    "\n Numero de cuenta  =>" +c.getNumCuenta()+
                                    "\n Monto  => $" +c.getMonto());
        
        
    }
}
