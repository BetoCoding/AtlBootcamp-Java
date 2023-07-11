package c8_Funciones;

public class Cuadrado {

    public static void main(String[] args) {

        float sumatoria = 0;
        sumatoria += getAreaCuadrado(10, 15);
        sumatoria += getAreaCuadrado(20, 30);
        System.out.println("Sumatoria total: " + sumatoria);
    }

    public static float getAreaCuadrado(float base, float altura) {
        return base * altura;
    }
}
