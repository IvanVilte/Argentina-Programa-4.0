package Clase4.Ejercicio1;

import java.util.Scanner;

public class ItemB {
    public static void main(String[] args) {
        int a, b, c;
        char sort;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el 1er número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el 2do número: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el 3er número: ");
        c = Integer.parseInt(scanner.nextLine());
        System.out.println("Como quiere ordenar sus números?(A - Ascendente, D - Descendente): ");
        sort = (scanner.nextLine().toUpperCase()).charAt(0);

        if(sort != 'A' && sort != 'D'){
            System.out.println("Usted ingreso una opción inválida, por defecto se ordena de manera Ascendente");
            sort = 'A';
        }

        System.out.println("NÚMEROS ORDENADOS:");
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
