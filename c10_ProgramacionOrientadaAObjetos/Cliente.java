package c10_ProgramacionOrientadaAObjetos;

public class Cliente {

    private String nombre;
    String apellido;
    Integer edad;

    public Cliente() {
        System.out.println("PASE POR ACÁ!!!");
    }

    public Cliente(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String value) {
        nombre = value;
    }
}
