import java.util.Scanner;

/**
 * Ejercicio 06: "Generar una solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double montoprestamo, interesmensual, pagomensual;
        int plazomeses = 12;
        System.out.print("Ingrese el monto del prestamo: ");
        montoprestamo = tcl.nextDouble();
        System.out.print("Ingrese el interes mensual: ");
        interesmensual = tcl.nextDouble();
        pagomensual = (montoprestamo + interesmensual * plazomeses)/ plazomeses;
        System.out.print("El valor del pago mensual es: " + pagomensual);               
    }
}

/***
 * EVIDENCIA DEL RUN:
 Ingrese el monto del prestamo: 2000
Ingrese el interes mensual: 5
El valor del pago mensual es: 171.66666666666666
* BUILD SUCCESSFUL (total time: 6 seconds)
 */

