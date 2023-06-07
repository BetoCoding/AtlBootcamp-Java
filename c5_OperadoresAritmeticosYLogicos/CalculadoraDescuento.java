package c5_OperadoresAritmeticosYLogicos;

import java.util.Scanner;

public class CalculadoraDescuento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Descuento");
        System.out.print("Ingresa el precio del artículo: ");
        double precio = sc.nextDouble();
        System.out.print("Ingresa el descuento: ");
        double descuento = sc.nextDouble();

        double cantidadADescontar = (precio * descuento) / 100;
        double precioFinal = precio - cantidadADescontar;
        System.out.println("\nCuenta");
        System.out.println("Precio: " + precio);
        System.out.println("Descuento " + descuento + "%: " + "-" + cantidadADescontar);
        System.out.println("Precio final: " + precioFinal);
    }
}
