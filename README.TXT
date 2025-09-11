import java.util.Scanner;

public class ArrayDePuntos {
    public static void main(String[] args) {
        Punto[] puntos = new Punto[6];
        Scanner scanner = new Scanner(System.in);

        // Ingresar las coordenadas de los puntos
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese las coordenadas para el punto " + (i + 1) + ":");
            System.out.print("X: ");
            double x = scanner.nextDouble();
            System.out.print("Y: ");
            double y = scanner.nextDouble();
            puntos[i] = new Punto(x, y);
        }

        // Imprimir las coordenadas de los puntos
        System.out.println("Coordenadas de los puntos:");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Punto " + (i + 1) + ": (" + puntos[i].getX() + ", " + puntos[i].getY() + ")");
        }

        // Calcular y imprimir las distancias entre puntos consecutivos
        System.out.println("Distancias entre puntos consecutivos:");
        for (int i = 0; i < puntos.length - 1; i++) {
            double distancia = puntos[i].calcularDistancia(puntos[i + 1]);
            System.out.println("Distancia entre Punto " + (i + 1) + " y Punto " + (i + 2) + ": " + distancia);
        }
    }
}
