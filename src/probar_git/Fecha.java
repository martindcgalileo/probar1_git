package probar_git;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public Fecha() {
        LocalDate hoy = LocalDate.now();
        dia = hoy.getDayOfMonth();
        mes = hoy.getMonthValue();
        año = hoy.getYear();
    }

    public static int dias(Fecha f1, Fecha f2) {
        LocalDate fecha1 = LocalDate.of(f1.año, f1.mes, f1.dia);
        LocalDate fecha2 = LocalDate.of(f2.año, f2.mes, f2.dia);
        return Math.abs((int) ChronoUnit.DAYS.between(fecha1, fecha2));
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

}
