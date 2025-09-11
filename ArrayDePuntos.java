import java.util.*;
public class ArrayDePuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Punto[] puntos = new Punto[6];

        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese las coordenadas para el punto " + (i + 1) + ":");
            System.out.print("X: ");
            double x = scanner.nextDouble();
            System.out.print("Y: ");
            double y = scanner.nextDouble();
            
            puntos[i] = new Punto(x, y);
        }
        
        System.out.println("Coordenadas de los puntos:");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Punto " + (i+1) + ": ");
            puntos[i].mostrar();
        }
            
        System.out.println("Distancias entre puntos consecutivos:");
        for (int i = 0; i < puntos.length - 1; i++) {
             double distancia = puntos[i].distanciaA(puntos[i + 1]);
             System.out.println("Distancia entre Punto " + (i + 1) + " y Punto " + (i + 2) + ": " + distancia);
        }
    }
}
