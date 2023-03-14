import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        Path path;
        char operator;
        int acumulador;

        if (args.length > 0 && args.length == 2) {
            path = Paths.get(args[0]);
            operator = args[1].charAt(0);
        } else {
            //path = Paths.get("src\\Clase4\\numeros.txt"); si no sirve el otro path probar con este. Este se probó en el IDE IntelliJ
            path = Paths.get("numeros.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la operación que desea realizar(Suma + / Producto *): ");
            operator = scanner.nextLine().charAt(0);
            if(operator != '+' && operator != '*'){
                System.out.println("La operación ingresada no es válida, por defecto se realiza la suma");
                operator = '+';
            }
        }

        if (operator == '+') {
            acumulador = 0;
            String[] numbers;
            for (String line : Files.readAllLines(path)) {
                numbers = line.split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    acumulador = acumulador + Integer.parseInt(numbers[i]);
                }
            }
        } else {
            acumulador = 1;
            String[] numbers;
            for (String line : Files.readAllLines(path)) {
                numbers = line.split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    acumulador = acumulador * Integer.parseInt(numbers[i]);
                }
            }
        }
        System.out.println("La suma de los números es: " + acumulador);
    }
}
