import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura 
  se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales
  (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
  rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado,
  mientras que la altura mide lo mismo que la altura de los triángulos. Se 
  pide que haga un programa que calcule el área total.
  Por cultura general, sabemos que el área de un rectángulo se calcula 
  multiplicando su base por su altura; el área de un triángulo rectángulo se
  calcula multiplicando su base por su altura, y luego dividiendo el 
  resultado entre dos; finalmente, el área de un cuadrado se calcula elevando
  al cuadrado la medida de uno de sus lados.


 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, areatotal;
        double areacuadrado;
        double areatriangu;
        double arearectan;
        System.out.println("Ingrese medida del lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.println("Ingrese altura: ");
        altura = tcl.nextDouble();
        areacuadrado = lado * lado;
        areatriangu = (lado * altura) / 2 ;
        arearectan = lado * altura;
        areatotal = areacuadrado + 3 *areatriangu + arearectan;
        System.out.println("El area del poligono: " + areatotal);
    }          
}

/***
 * EVIDENCIA DEL RUN:
 Ingrese medida del lado del cuadrado: 
 7
 Ingrese altura: 
 8
 El area del poligono: 189.0
 BUILD SUCCESSFUL (total time: 4 seconds)
 */