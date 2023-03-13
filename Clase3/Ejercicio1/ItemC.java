package Clase3.Ejercicio1;

public class ItemC {



    public static void main(String[] args) {
        int numbers[] = new int[5];
        int num = 6;
        int sum = 0;

        numbers[0] = 19;
        numbers[1] = 9;
        numbers[2] = 7;
        numbers[3] = 6;
        numbers[4] = 6;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > num){
                sum = sum + numbers[i];
            }
        }

        System.out.println("El resultado de sumar todos los numero mayores que " + num + " es " + sum);
    }
}
