package modelo;

public class Cliente {
    private String nombre,apellido;
    private String dui,nit;
    private String numCuenta;
    private String tipoCuen;
    private double monto;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dui, String nit, String numCuenta, String tipoCuen, double monto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.nit = nit;
        this.numCuenta = numCuenta;
        this.tipoCuen = tipoCuen;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuen() {
        return tipoCuen;
    }

    public void setTipoCuen(String tipoCuen) {
        this.tipoCuen = tipoCuen;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
