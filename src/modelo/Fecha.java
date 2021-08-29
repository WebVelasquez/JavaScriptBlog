package modelo;

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    private boolean aBisiesto(){
        return (anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0);
    }
    
    public boolean fechaCorrecta(){
        boolean diaC,mesC,anioC;
        anioC = anio > 0;
        mesC = mes >= 1 && mes <= 12;
        switch(mes){
            case 2:
                if (aBisiesto()) {
                    diaC = dia >= 1 && dia <= 29;
                }else{
                    diaC = dia >= 1 && dia <= 28;
                }
                break;
            case 4: 
            case 6:
            case 9:
            case 11:
                diaC = dia >= 1 && dia <= 30;
                break;
            default:
                diaC = dia >= 1 && dia <= 31;
        }
        return diaC && mesC && anioC;
    }
    
    public void diaSiguiente(){
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                anio++;
            }
        }
    } 
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(anio);
        return sb.toString();
    }
}
