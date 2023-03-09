public class Ejercicio2 {

    public static void main(String[] args) {
        double ingresoMensuales = 400;
        int cantVehiculos = 2;
        int cantInmuebles = 2;
        boolean esTitularDeActivos = false;
        
        if(ingresoMensuales >= 489083 || cantVehiculos >= 3 || cantInmuebles >= 3 || esTitularDeActivos){
            System.out.println("Usted pertenece al segmento de ingresos altos");
        }
        else {
            System.out.println("Usted no pertenece al segmento de ingresos altos");
        }
    }
}
