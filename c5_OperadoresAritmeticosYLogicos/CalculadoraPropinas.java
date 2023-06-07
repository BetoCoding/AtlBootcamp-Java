package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class CalculadoraPropinas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Propinas");
        System.out.print("Ingresa el total de la cuenta: ");
        double cuenta = sc.nextDouble();
        System.out.print("Ingresa el porcentaje de propina: ");
        double propina = sc.nextDouble();

        double cantidadASumar = (cuenta * propina) / 100;
        double cuentaFinal = cuenta + cantidadASumar;
        System.out.println("\nCuenta");
        System.out.println("Total: " + cuenta);
        System.out.println("Propina " + propina + "%: " + "+" + cantidadASumar);
        System.out.println("Total + Propina: " + cuentaFinal);
    }
}
