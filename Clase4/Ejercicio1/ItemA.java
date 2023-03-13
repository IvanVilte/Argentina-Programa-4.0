package Clase4.Ejercicio1;

public class ItemA {

    public static void main(String[] args) {
        int a, b, c;
        char sort;
        if (args.length > 0 && args.length == 4){
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            sort = (args[3].toUpperCase()).charAt(0);
        }else{
            a = 1;
            b = 2;
            c = 3;
            sort = 'A';
            System.out.println("Por defecto se ordena de manera ascendente");
        }

        if(a == b && a == c){
            System.out.println(a + " = " + b + " = " + c);

        }
        else if(sort == 'A') {
            if(a > b && b > c){
                System.out.println(a + " > " + b + " > " + c);
            } else if (a > c && c > b) {
                System.out.println(a + " > " + c + " > " + b);
            } else if (b > a && a > c) {
                System.out.println(b + " > " + a + " > " + c);
            } else if (b > c && c > a) {
                System.out.println(b + " > " + c + " > " + a);
            } else if (c > a && a > b){
                System.out.println(c + " > " + a + " > " + b);
            } else if (c > b && b > a) {
                System.out.println(c + " > " + b + " > " + a);
            }
        } else if (sort == 'D') {
            if(a > b && b > c){
                System.out.println(c + " < " + b + " < " + a);
            } else if (a > c && c > b) {
                System.out.println(b + " < " + c + " < " + a);
            } else if (b > a && a > c) {
                System.out.println(c + " < " + a + " < " + b);
            } else if (b > c && c > a) {
                System.out.println(a + " < " + c + " < " + b);
            } else if (c > a && a > b){
                System.out.println(b + " < " + a + " < " + c);
            } else if (c > b && b > a) {
                System.out.println(a + " < " + b + " < " + c);
            }
        }
    }
}
