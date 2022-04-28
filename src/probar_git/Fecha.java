package probar_git;

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

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
        
}
