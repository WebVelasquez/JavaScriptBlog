package controlador;
import java.util.Scanner;
import modelo.Contador;

public class ContadorController {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contador objc1  = new Contador();
        
        int c;
        System.out.println("valor de inicio  ");
        c=s.nextInt();
        
        objc1.setCont(c);
        objc1.incrementar();
        System.out.println(objc1.getCont());
        objc1.decrementar();
        System.out.println(objc1.getCont());
       
        
    }
}
