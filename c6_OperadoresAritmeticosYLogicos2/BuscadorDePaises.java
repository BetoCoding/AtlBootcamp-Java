package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class BuscadorDePaises {

    public static void main(String[] args) {

        System.out.println("BUSCADOR DE PAISES");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un país: ");
        String pais = sc.nextLine();

        System.out.println("\nEnlace a la información: ");
        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
