package probar_git;

public class Probar_Fecha {

    public static void main(String[] args) {
        Fecha hoy = new Fecha();
        System.out.println("Fecha de hoy = " + hoy);
        Fecha vacaciones=new Fecha(23,6,2022);
        int dias=Fecha.dias(hoy, vacaciones);
        System.out.println("Fecha de inicio de las vacaciones de verano "+vacaciones);
        System.out.println("Faltan "+dias+" días para las vaciones de verano");
    }

}
