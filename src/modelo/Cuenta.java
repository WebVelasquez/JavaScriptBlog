package modelo;


public class Cuenta {
    private String nombreC;
    private String nCuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombreC, String nCuenta, double interes, double saldo) {
        this.nombreC = nombreC;
        this.nCuenta = nCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public Cuenta (Cuenta objc){
        this.nombreC = objc.nombreC;
        this.nCuenta = objc.nCuenta;
        this.interes = objc.interes;
        this.saldo = objc.saldo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }   
    
    public boolean ingreso(double x){
        boolean iCorrecto = true;
        if (x < 0) {
            iCorrecto = false; 
        }else{
            saldo = saldo + x;
        }
        return iCorrecto;
    }
    
    public boolean reintegro(double x){
        boolean rCorrecto = true;
        if (x < 0) {
            rCorrecto = false;
        }else if (saldo >= x) {
            saldo = x;            
        }else{
            rCorrecto = false;
        }
        return rCorrecto;
    }
}
