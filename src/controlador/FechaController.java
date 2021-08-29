package controlador;
import javax.swing.JOptionPane;
import modelo.Fecha;


public class FechaController {
    public static void main(String[] args) {
        int dia,mes,anio;
     
      
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "dia :"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "mes :"));
        anio = Integer.parseInt(JOptionPane.showInputDialog(null, "año :"));
        Fecha fch = new Fecha(dia,mes,anio);
        
        
        if (fch.fechaCorrecta()) {
            JOptionPane.showMessageDialog(null,"fecha ingresada: " + fch);
            for (int i = 1; i < 2; i++) {
                fch.diaSiguiente();
                  JOptionPane.showMessageDialog(null," fecha dia siguiente: " + fch);
            }        
             }else{
              JOptionPane.showMessageDialog(null, "Error");

        }               
    }
}
