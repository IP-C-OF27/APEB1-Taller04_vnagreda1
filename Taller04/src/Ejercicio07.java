import java.util.Scanner;

/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor
 a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costokh,kconsumidos, totalpagar;
        double descuento = 0.10;
        int edad;
        System.out.print("Ingrese el costo de kilovatio/hora: ");
        costokh = tcl.nextDouble();
        System.out.print("Ingrese kilovatios consumidos en el mes: ");
        kconsumidos = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        totalpagar = costokh * kconsumidos;
        if (edad > 65 ){
            totalpagar = totalpagar - (totalpagar * descuento);
        }
         System.out.print("El valor a cancelar es: " + totalpagar); 
    }
}
/***
 * EVIDENCIA DEL RUN:
 Ingrese el costo de kilovatio/hora: 15
 Ingrese kilovatios consumidos en el mes: 20
 Ingrese su edad: 66
 El valor a cancelar es: 270.0BUILD SUCCESSFUL (total time: 14 seconds)
 */
