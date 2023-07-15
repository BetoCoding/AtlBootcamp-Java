package c10_ProgramacionOrientadaAObjetos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cliente cliente1 = cargarCliente();
        //Cliente cliente2 = cargarCliente();


        Cuenta cuenta1 = new Cuenta();
        cuenta1.depositar();
        cuenta1.retirar();
        cuenta1.mostrar();


        //Persona persona1 = new Persona();
        //persona1.mostrar();
    }

    public static Cliente cargarCliente() {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        // utilizando la convención de setter y getter
        System.out.print("Ingresa el nombre: ");
        cliente.setNombre(sc.nextLine());
        //System.out.printf("Nombre: " + cliente.getNombre());

        // asignando valores directos, funciona, pero no se trabaja así en el ambiente laboral
        // los frameworks utilizan los getters y setters, por lo que hacerlo de esta forma nos traerá problemas
        System.out.print("Ingresa el apellido: ");
        cliente.apellido = sc.nextLine();

        System.out.print("Ingresa la edad: ");
        cliente.edad = sc.nextInt();

        cliente.mostrarDatos();

        return cliente;
    }

}
