package Clase3.Ejercicio1;

public class ItemA {
    public static void main(String[] args) {
        String cad = "Hola como estan?. Mi nombre es Felipe.";
        char letter = 'e';
        int tamCad = cad.length();
        int contadorLetra = 0;

        for (int i = 0; i < tamCad; i++) {
            if(letter == cad.charAt(i)){
                contadorLetra++;
            }
        }
        System.out.println("La letra \'" + letter + "\' aparece " + contadorLetra + " veces.");
    }
}
