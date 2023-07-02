package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class MayorYMenor {

    public static void main(String[] args) {

        System.out.println("MAYOR Y MENOR");
        System.out.println("Ingresa 3 números");

        Scanner sc = new Scanner(System.in);
        System.out.print("Primero: ");
        double num = sc.nextDouble();
        double mayor = num;
        double menor = num;

        System.out.print("Segundo: ");
        double num2 = sc.nextDouble();

        if (num2 > mayor) {
            mayor = num2;
        } else {
            menor = num2;
        }


        System.out.print("Tercero: ");
        double num3 = sc.nextDouble();

        if (num3 > mayor) {
            mayor = num3;
        } else if (num3 < menor) {
            menor = num3;
        } else if (num == num2 && num2 == num3) {
            System.out.println("\nTODOS SON IGUALES: " + num);
        } else {
            System.out.println("\nEl número MAYOR es: " + mayor);
            System.out.println("El número MENOR es: " + menor);
        }




    }
}
