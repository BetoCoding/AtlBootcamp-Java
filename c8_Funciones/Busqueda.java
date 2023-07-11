package c8_Funciones;

import java.util.Scanner;

/*
Crea un programa que tenga un arreglo con nombres completos de personas.
Además, debe permitir realizar una búsqueda por el nombre de la persona
 */
public class Busqueda {

    public static void main(String[] args) {

        String[] personas = {"Alberto Cordova", "Vanessa Claudio", "Hugo Sanchez", "Salma Hayek", "Alfredo Adame"};

        System.out.print("Ingrese busqueda: ");
        Scanner sc = new Scanner(System.in);
        String busqueda = sc.nextLine();

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("La persona es: " + personas[i]);
            }
        }
    }
}
