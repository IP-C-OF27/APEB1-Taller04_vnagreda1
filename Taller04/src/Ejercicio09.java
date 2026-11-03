
import java.util.Scanner;

/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
  una persona estudiante en una asignatura universitaria a partir de una 
  calificación de evaluación continua, una calificación de examen final y un
 porcentaje de asistencia. La regla institucional establece que:

 La asistencia mínima debe alcanzarse para ser evaluado
 Existe una nota mínima en el examen final, y
 La nota final se calcula combinando evaluación continua y examen final.
 La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
 nota final redondeada a un decimal.
 * @author Valeria Agreda
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double calificacionE, calificacionF, califinal;
        double asistencia;
        double porcen = 0.5;
        System.out.println("Ingrese su calificacion de evaluacion: ");
        calificacionE = tcl.nextDouble();
        System.out.println("Ingrese su calificacion de examen final: ");
        calificacionF = tcl.nextDouble(); 
        System.out.println("Ingrese su porcentaje de asitencia: ");
        asistencia = tcl.nextDouble(); 
        califinal = (calificacionE * porcen)+ (calificacionF * porcen);
        if (asistencia < 70){
            System.out.println("No cumple con el minimo de asistencias");
        }
        if (asistencia >= 70 && califinal >= 7){
            System.out.println("Aprobado"); 
            System.out.println("Nota final: " + califinal);   
        }
        if (asistencia >= 70 && califinal >6 && califinal <7 ){
            System.out.println("Supletorio"); 
            System.out.println("Nota final: " + califinal); 
        }
        if (asistencia >= 70 && califinal < 6){
            System.out.println("Reprobado"); 
            System.out.println("Nota final: " + califinal);   
        }   
 }        
} 
/***
 * EVIDENCIA DEL RUN:
 Ingrese su calificacion de evaluacion: 
 8
 Ingrese su calificacion de examen final: 
 9
 Ingrese su porcentaje de asitencia: 
 80
 Aprobado
 Nota final: 8.5
 BUILD SUCCESSFUL (total time: 10 seconds
 */