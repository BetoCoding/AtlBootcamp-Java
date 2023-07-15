package c10_ProgramacionOrientadaAObjetos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String fechaDeNacimiento;

    public Persona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los datos de la Persona");
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Fecha de Nacimiento (yyyy-mm-dd): ");
        fechaDeNacimiento = sc.next();
        System.out.print("Edad: ");
        edad = sc.nextInt();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void mostrar() {
        System.out.println("\nId: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
        System.out.println("Edad: " + edad);

        boolean esMayorDeEdad = esMayorDeEdad();
        if (esMayorDeEdad) {
            System.out.println("ES MAYOR DE EDAD!!!");
        } else {
            System.out.println("ES MENOR DE EDAD!!!");
        }
    }

    public boolean esMayorDeEdad() {

        LocalDate inicio = LocalDate.parse(fechaDeNacimiento);
        LocalDate fin = LocalDate.now();
        int mayorEdad = Period.between(inicio, fin).getYears();

        return mayorEdad >= 18;
    }


}
