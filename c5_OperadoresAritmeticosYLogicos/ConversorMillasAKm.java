package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class ConversorMillasAKm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Conversión de Millas a Kilómetros");
        System.out.print("Ingresa las Millas: ");
        double millas = sc.nextDouble();

        double kilometros = millas * 1.60934;
        System.out.println(millas + " MILLAS son: " + kilometros + " KM");
    }
}
