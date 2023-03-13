package Clase3;

public class Ejercicio2 {

    public static void main(String[] args) {
        String cad = "Maria,Ivan,Carlos,Abel,Graciela,Felipe,Catrina,China,Tom,Mateo";
        String [] names = cad.split(",");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
