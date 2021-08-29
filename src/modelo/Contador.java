package modelo;

public class Contador {
    
    private int cont;

    public Contador() {
    }

    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }    
    
    public Contador(Contador ctd){
        cont = ctd.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void incrementar(){
        cont++;
    }
    
    public void decrementar(){
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}
