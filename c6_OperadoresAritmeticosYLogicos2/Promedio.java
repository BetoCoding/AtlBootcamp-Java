package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        System.out.println("PROMEDIO");
        System.out.println("Ingresa 3 números");

        Scanner sc = new Scanner(System.in);
        System.out.print("Primero: ");
        double num = sc.nextDouble();
        System.out.print("Segundo: ");
        double num2 = sc.nextDouble();
        System.out.print("Tercero: ");
        double num3 = sc.nextDouble();

        double promedio = (num + num2 + num3) / 3;
        System.out.println("\nPromedio: " + promedio);
    }
}
