package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ingresamos peso/altura por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();

        // Fórmula IMC (Indice de Masa Corporal)
        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu Indice de Masa Corporal (IMC) es: " + indiceMasaCorporal);

        // Mayor a 30 -> Obesidad
        if (indiceMasaCorporal > 30) {
            System.out.println("Estas en estado de OBESIDAD. Alerta!!!");
        }
        // Entre 25 y 30 -> Sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal <= 30) {
            System.out.println("Estas en estado de SOBREPESO. Cuidate!!!");
        }
        // Mayor a 18.6 y menor de 25 -> Normal
        if (indiceMasaCorporal > 18.6 && indiceMasaCorporal < 25) {
            System.out.println("Estas en estado NORMAL. Felicidades!!!");
        }
        // Menor igual  18.6 -> Bajo de peso
        if (indiceMasaCorporal <= 18.6) {
            System.out.println("Estas en estado DEBAJO DE LO NORMAL. Cuidate!!!");
        }
    }
}
