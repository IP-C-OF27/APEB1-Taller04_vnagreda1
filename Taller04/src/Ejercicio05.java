import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, raton,total;
        System.out.print("Ingrese el precio de CPU: ");
        cpu = tcl.nextDouble();
        System.out.print("Ingrese el precio de teclado: ");
        teclado = tcl.nextDouble();
        System.out.print("Ingrese el precio de pantalla: ");
        pantalla = tcl.nextDouble();
        System.out.print("Ingrese el precio de raton: ");
        raton = tcl.nextDouble();
        total = cpu + teclado + pantalla + raton;
        System.out.print("El costo total de la computadora es: " + total);               
    }
}

/***
 * EVIDENCIA DEL RUN:
 Ingrese el precio de CPU: 10
 Ingrese el precio de teclado: 10
 Ingrese el precio de pantalla: 20
 Ingrese el precio de raton: 15
 El costo total de la computadora es: 55.0
 BUILD SUCCESSFUL (total time: 15 seconds)
 */