package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class JuegoAdivinaNumero {

    public static void main(String[] args) {

        System.out.println("JUEGO ADIVINA EL NUMERO");
        System.out.println("Elige un número entre el 1-10\n");
        int numAleatorio = (int)(Math.random() * 10) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número (Único Intento): ");
        int numElegido = sc.nextInt();

        if (numElegido == numAleatorio) {
            System.out.println("\nFelicidades ACERTASTE!!!");
        } else {
            System.out.println("\nNúmero ERRONEO. Suerte para la próxima!!!");
            System.out.println("Número correcto: " + numAleatorio);
        }

    }
}
