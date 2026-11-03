import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona. Los 
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la 
 * persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            double netflix, youtubep, dropbox, spotify, total;
            double descuento = 0.20;
            int edad; 
            System.out.print("Ingrese el precio de netflix: ");
            netflix = tcl.nextDouble();
            System.out.print("Ingrese el precio de youtube: ");
            youtubep = tcl.nextDouble();
            System.out.print("Ingrese el precio de dropbox: ");
            dropbox = tcl.nextDouble();
            System.out.print("Ingrese el precio de spotify: ");
            spotify = tcl.nextDouble();
            System.out.print("Ingrese su edad: ");
            edad = tcl.nextInt();
            total = netflix + youtubep + dropbox + spotify;
            if (edad < 30 ){
                total = total - descuento;  
            }
            System.out.print("El valor total a pagar es: " + total);  
        }
    }
/***
 * EVIDENCIA DEL RUN:
 Ingrese el precio de netflix: 10
 Ingrese el precio de youtube: 10
 Ingrese el precio de dropbox: 8
 Ingrese el precio de spotify: 5
 Ingrese su edad: 20
 El valor total a pagar es: 32.8
 * BUILD SUCCESSFUL (total time: 37 seconds)
 */