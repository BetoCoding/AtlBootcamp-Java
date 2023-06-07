package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class CalculadoraEdadPerro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Se calcula que cada año de perro equivale a 7 años humanos");
        System.out.print("Ingresa la edad de tu perro: ");
        int edad = sc.nextInt();

        int edadHumana = edad * 7;
        System.out.println("La edad de tu perro en años humanos es: " + edadHumana);
    }
}
