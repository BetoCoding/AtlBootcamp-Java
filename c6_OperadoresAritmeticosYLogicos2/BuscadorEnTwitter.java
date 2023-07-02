package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class BuscadorEnTwitter {

    public static void main(String[] args) {

        System.out.println("BUSCADOR EN TWITTER");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una celebridad (una sola palabra): ");
        String celebridad = sc.nextLine();

        System.out.println("\nEnlace a la información: ");
        System.out.println("https://twitter.com/search?q=" + celebridad);
    }
}
