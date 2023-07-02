package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class LlamarPorWhatsapp {

    public static void main(String[] args) {

        System.out.println("LLAMAR POR WHATSAPP");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa telefono: ");
        String telefono = sc.nextLine();

        System.out.println("\nLlamar: ");
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);

    }
}
