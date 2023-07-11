package c8_Funciones;

import java.util.Scanner;

public class Funcion {

    // (String[] args) -> permite mandarle parametros en la ejecución del programa (Age of Empires -> dimensiones
    // de la pantalla width-height, etc)
    public static void main(String[] args) {

        // hacer un programa que permita al usuario ingresar 5 números y mostrarlos
        int[] numeros = new int[5];
        System.out.println("INGRESA 5 NUMEROS");
        cargarNumeros(numeros);
        mostrarNumeros(numeros);

    }

    // podemos extraer métodos de un fragmento de código (Seleccionar código + clic derecho + Refactor + Extract method)
    private static void cargarNumeros(int[] numeros) {
        int contador = 0;
        for (contador = 0; contador < numeros.length; contador ++) {
            int numero = perdirNumeroAlUsuario();
            numeros[contador] = numero;
        }
    }

    public static int perdirNumeroAlUsuario() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();

        return numero;
    }

    public static void mostrarNumeros(int[] numeros) {

        int contador = 0;
        System.out.println("\nLos números que usted ingreso son: ");
        while (contador < numeros.length) {
            System.out.print(numeros[contador]);
            contador ++;
        }

    }
}
