package c10_ProgramacionOrientadaAObjetos;

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private float cantidad;

    public Cuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del titular: ");
        titular = sc.nextLine();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Saldo total: $" + cantidad);
    }

    public void depositar() {

        // el Scanner, sería más correcto hacerlo en el Main y pasarle el parámetro al método
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad a depositar: ");

        float cantidadADepositar = sc.nextFloat();
        if (cantidadADepositar > 0) {
            cantidad += cantidadADepositar;
        } else {
            System.out.println("Ingresa una cantidad válida");
        }
    }

    public void retirar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad a retirar: ");

        float cantidadARetirar = sc.nextFloat();
        if (cantidadARetirar > 0) {
            cantidad -= cantidadARetirar;
        } else {
            System.out.println("Ingresa una cantidad válida");
        }
    }
}
