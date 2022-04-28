package probar_git;

import java.time.LocalDate;

public class Fecha {
    //atributos
    private int dia;
    private int mes;
    private int año;
    
    //constructor
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha(){
        LocalDate hoy=LocalDate.now();
        dia=hoy.getDayOfMonth();
        mes=hoy.getMonthValue();
        año=hoy.getYear();
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
        
}
