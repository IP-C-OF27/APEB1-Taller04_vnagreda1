import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área
 * de un triángulo. Los datos deben ser pedidos al usuario.
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altu, area;
        System.out.print("Deme base: ");
        base = tcl.nextDouble();
        System.out.print("Deme altura: ");
        altu = tcl.nextDouble();
        area = (base -altu)/2;
        System.out.print("El area es: " + area);     
    }
}

/***
 * EVIDENCIA DEL RUN:
 Deme base: 2
 Deme altura: 3
 El area es: -0.5
 BUILD SUCCESSFUL (total time: 5 seconds)
 */
