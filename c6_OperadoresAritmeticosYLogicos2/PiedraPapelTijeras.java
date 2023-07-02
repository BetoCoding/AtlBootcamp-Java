package c6_OperadoresAritmeticosYLogicos2;

import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void main(String[] args) {

        System.out.println("JUEGO (piedra - papel - tijeras)");
        System.out.println("El programa seleccionara un elemento aleatoriamente despúes que escribas tu elemento");
        System.out.print("ELIGE: ");

        Scanner sc = new Scanner(System.in);
        String elemento = sc.nextLine();

        int random = (int)((Math.random() * 3) + 1);
        String randomElement = "";

        switch (random) {
            case 1:
                randomElement = "piedra";
                break;
            case 2:
                randomElement = "papel";
                break;
            case 3:
                randomElement = "tijeras";
                break;
        }

        String empate = "EMPATE";
        String perdiste = "PERDISTE";
        String ganaste = "GANASTE";
        String error = "ERROR, ELEMENTO NO VALIDO";
        String resultado = "";

        if (elemento.equals(randomElement)) {
            resultado = empate;
        } else if (elemento.equals("piedra") && randomElement.equals("papel")) {
            resultado = perdiste;
        } else if (elemento.equals("piedra") && randomElement.equals("tijeras")) {
            resultado = ganaste;
        } else if (elemento.equals("papel") && randomElement.equals("piedra")) {
            resultado = ganaste;
        } else if (elemento.equals("papel") && randomElement.equals("tijeras")) {
            resultado = perdiste;
        } else if (elemento.equals("tijeras") && randomElement.equals("papel")) {
            resultado = ganaste;
        } else if (elemento.equals("tijeras") && randomElement.equals("piedra")) {
            resultado = perdiste;
        } else {
            resultado = error;
        }

        System.out.println("\nTU-> " + elemento + " vs " + randomElement + " <-PC");
        System.out.println(resultado);

    }
}
