import java.util.Scanner;
/**
 * Ejercicio 03: " Se desea desarrollar un algoritmo que permita mostrar la 
 * tabla de multiplicar de un número ingresado por el usuario; solo en el caso
 * que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa el numero entre 2 y 6: ");
        numero = tcl.nextInt();
        if (numero >= 2 && numero <=6) 
            System.out.println("Tablas de multiplicar del: " + numero);
        System.out.println(numero + "  * 1=  " + (numero*1));
        System.out.println(numero + "  * 2=  " + (numero*2));
        System.out.println(numero + "  * 3=  " + (numero*3));
        System.out.println(numero + "  * 4=  " + (numero*4));
        System.out.println(numero + "  * 5=  " + (numero*5));
        System.out.println(numero + "  * 6=  " + (numero*6));
        System.out.println(numero + "  * 7=  " + (numero*7));
        System.out.println(numero + "  * 8=  " + (numero*8));
        System.out.println(numero + "  * 9=  " + (numero*9));
        System.out.println(numero + "  * 10= " + (numero*10));
        System.out.println(numero + "  * 11= " + (numero*11));
        System.out.println(numero + "  * 12= " + (numero*12));
    }
}
/***
 * EVIDENCIA DEL RUN:
 Ingresa el numero entre 2 y 6: 3
 Tablas de multiplicar del: 3
 3  * 1=  3
 3  * 2=  6
 3  * 3=  9
 3  * 4=  12
 3  * 5=  15
 3  * 6=  18
 3  * 7=  21
 3  * 8=  24
 3  * 9=  27
 3  * 10= 30
 3  * 11= 33
 3  * 12= 36
 BUILD SUCCESSFUL (total time: 10 seconds)
 */
