public class Ejercicio1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 14;

        // Inciso A
        System.out.println("Inciso A");
        while (a <= b) {
            System.out.print(a);
            if(a < b){
                System.out.print(",");
            }
            a++;
        }
        System.out.print("\n");
        a = 5;
        b = 14;

        // Inciso B
        System.out.println("Inciso B");
        while (a <= b) {
            if(a % 2 == 0){
                System.out.print(a);
                if(a < b){
                    System.out.print(",");
                }
            }
            a++;
        }
        System.out.print("\n");
        a = 5;
        b = 14;

        // Inciso C
        System.out.println("Inciso C");
        boolean mostrarPares = false;

        if (mostrarPares){
            while (a <= b) {
                if(a % 2 == 0){
                    System.out.print(a);
                    if(a < b){
                        System.out.print(",");
                    }
                }
                a++;
            }
        }
        else {
            while (a <= b) {
                if(a % 2 != 0){
                    System.out.print(a);
                    if(a < b){
                        System.out.print(",");
                    }
                }
                a++;
            }
        }
        System.out.print("\n");
        a = 5;
        b = 14;

        // Inciso D
        System.out.println("Inciso D");
        for (int i = b; i >= a; i--) {
            if(i % 2 == 0){
                System.out.print(i);
                if(a < i-1){
                    System.out.print(",");
                }
            }
        }
    }
}
