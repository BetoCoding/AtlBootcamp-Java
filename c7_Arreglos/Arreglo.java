package c7_Arreglos;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {

        // hacer un programa que permita al usuario ingresar 5 números y mostrarlos
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA 5 NUMEROS");

        int contador = 0;
        /*
        while (contador < numeros.length) {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();
            numeros[contador] = numero;
            contador ++;
        }*/

        /*
        do {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();
            numeros[contador] = numero;
            contador ++;
        } while (contador < numeros.length); */

        // registramos los cinco números ingresados por el usuario
        for (contador = 0; contador < numeros.length; contador ++) {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();
            numeros[contador] = numero;
        }

        contador = 0;
        System.out.println("\nLos números que usted ingreso son: ");
        while (contador < numeros.length) {
            System.out.print(numeros[contador]);
            contador ++;
        }

        // imprimimos numero mayor y numero menor
        int numMayor = 0;
        int numMenor = 0;
        for (contador = 0; contador < numeros.length; contador ++) {
            int numero = numeros[contador];

            if (numero >= numMayor || contador == 0) {
                numMayor = numero;
            }

            if (numero <= numMenor || contador == 0) {
                numMenor = numero;
            }
        }

        System.out.println("\n\nNúmero Menor: " + numMenor);
        System.out.println("Número Mayor: " + numMayor);

        // sacamos promedio
        int sumatoria = 0;
        for (contador = 0; contador < numeros.length; contador ++) {
            sumatoria += numeros[contador];
        }
        System.out.println("\nLa sumatoria es: " + sumatoria);
        float promedio = (float)sumatoria / numeros.length;
        System.out.println("El promedio es: " + promedio);

    }
}
