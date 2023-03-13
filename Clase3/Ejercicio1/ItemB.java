package Clase3.Ejercicio1;

public class ItemB {

    public static void main(String[] args) {
        int numA = 3;
        int numB = 5;
        int numC = 3;
        boolean orderASC = true;
        int [] vector = new int[3];

        if (numA == numB && numB == numC) {
            vector[0] = numA;
            vector[1] = numB;
            vector[2] = numC;
        }
        else if(orderASC){
            if(numA > numB && numA > numC){
                 vector[0] = numA;
                 if(numB > numC) {
                     vector[1] = numB;
                 } else {
                     vector[1] = numC;
                     vector[2] = numB;
                 }
            } else {
                if(numB > numA && numB > numC){
                    vector[0] = numB;
                    if(numA > numC) {
                        vector[1] = numA;
                    } else {
                        vector[1] = numC;
                        vector[2] = numA;
                    }  
                } else if (numC > numA && numC > numB) {
                    vector[0] = numB;
                    if(numA > numC) {
                        vector[1] = numA;
                    } else {
                        vector[1] = numC;
                        vector[2] = numA;
                    }
                }
            }
        }
        else{
            if(numA > numB && numA > numC){
                vector[2] = numA;
                if(numB > numC) {
                    vector[1] = numB;
                } else {
                    vector[1] = numC;
                    vector[0] = numB;
                }
            } else {
                if(numB > numA && numB > numC){
                    vector[2] = numB;
                    if(numA > numC) {
                        vector[1] = numA;
                    } else {
                        vector[1] = numC;
                        vector[0] = numA;
                    }
                } else if (numC > numA && numC > numB) {
                    vector[2] = numB;
                    if(numA > numC) {
                        vector[1] = numA;
                    } else {
                        vector[1] = numC;
                        vector[0] = numA;
                    }
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }
}

