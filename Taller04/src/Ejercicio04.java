import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla del teléfono de una casa. Se debe ingresar el costo por
 * minutos,el número de minutos consumidos en el mes."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costominutos, minutosconsumidos, totalpagar;
        System.out.print("Ingrese costo por minutos: ");
        costominutos = tcl.nextDouble();
        System.out.print("Ingrese numero de minutos consumidos al mes: ");
        minutosconsumidos = tcl.nextDouble();
        totalpagar = costominutos * minutosconsumidos;
        System.out.print("El valor total de la planilla es: " + totalpagar);
    }
}

/***
 * EVIDENCIA DEL RUN:
 Ingrese costo por minutos: 10
 Ingrese numero de minutos consumidos al mes: 25
 El valor total de la planilla es: 250.0
 BUILD SUCCESSFUL (total time: 11 seconds)
 */