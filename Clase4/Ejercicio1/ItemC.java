package Clase4.Ejercicio1;

import java.util.Scanner;

public class ItemC {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        char sort;
        if (args.length > 0 && args.length == 4) {
            numbers[0] = Integer.parseInt(args[0]);
            numbers[1] = Integer.parseInt(args[1]);
            numbers[2] = Integer.parseInt(args[2]);
            sort = (args[3].toUpperCase()).charAt(0);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el 1er número: ");
            numbers[0] = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese el 2do número: ");
            numbers[1] = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese el 3er número: ");
            numbers[2] = Integer.parseInt(scanner.nextLine());
            System.out.println("Como quiere ordenar sus números?(A - Ascendente, D - Descendente): ");
            sort = (scanner.nextLine().toUpperCase()).charAt(0);
        }
        if (sort != 'A' && sort != 'D') {
            System.out.println("Usted ingreso una opción inválida, por defecto se ordena de manera Ascendente");
            sort = 'A';
        }

        System.out.println("NÚMEROS ORDENADOS:");
        ordenar(numbers);
        if(sort == 'A'){
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }else {
            for (int i = numbers.length; i >= 0; i--){
                System.out.println(numbers[i]);
            }
        }

    }

    public static void ordenar(int[] numbers) {
        int aux;

        if (numbers[0] > numbers[1] && numbers[1] > numbers[2]) {
            aux = numbers[0];
            numbers[0] = numbers[2];
            numbers[2] = aux;
        } else if (numbers[0] > numbers[2] && numbers[2] > numbers[1]) {
            aux = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = aux;
        } else if (numbers[1] > numbers[0] && numbers[0] > numbers[2]) {
            aux = numbers[0];
            numbers[0] = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = aux;
        } else if (numbers[1] > numbers[2] && numbers[2] > numbers[0]) {
            aux = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = aux;
        } else if (numbers[2] > numbers[0] && numbers[0] > numbers[1]) {
            aux = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = aux;
        }
    }
}
