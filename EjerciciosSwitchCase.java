/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosswitchcase;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class EjerciciosSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ******   ***   Ejercicio 1   ***   ******
        
        /*
        Crear un programa que simule la petición de una opción según el siguiente menú y muestre
        en pantalla que ha ingresado a la opción seleccionada, con las opciones siguientes:
        
        ¡Gracias por contactarte con nosotros!
        ¿En qué podemos ayudarte?
        A) Documentación
        B) Cotización
        C) Asistencia
        D) Siniestros
        E) Información de Pagos
        F) Otras Consultas
        G) Anulación
        Escribe la letra de la opción seleccionada.
        
        Debe mostrarse:
        Has elegido Documentación (o la opción que haya elegido)
        */
        
        System.out.println("******   Ejercicio 1   ******");
        System.out.println("Programa que simule la petición de una opción según el siguiente menú");
        
        System.out.println("\n¡Gracias por contactarte con nosotros!");
        System.out.println("¿En que podemos ayudarte?");
        
        
        System.out.println("\nA) Documentación");
        System.out.println("B) Cotización");
        System.out.println("C) Asistencia");
        System.out.println("D) Siniestros");
        System.out.println("E) Información de Pagos");
        System.out.println("F) Otras Consultas");
        System.out.println("G) Anulación");
        System.out.print("\nEscribe la letra de la opción seleccionada: ");
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();   
        String mensaje;
        
//        switch(opcion){
//            case "A","a": System.out.println("Has elegido Documentación"); break;
//            case "B","b": System.out.println("Has elegido Cotización"); break;
//            case "C","c": System.out.println("Has elegido Asistencia"); break;
//            case "D","d": System.out.println("Has elegido Siniestros"); break;
//            case "E","e": System.out.println("Has elegido Información de Pagos"); break;
//            case "F","f": System.out.println("Has elegido Otras Consultas"); break;
//            case "G","g": System.out.println("Has elegido Anulación"); break;
//            default: System.out.println("Opción INVALIDA!!!");
//        }

        mensaje = switch(opcion){
            case "A","a" -> "Has elegido Documentación";
            case "B","b" -> "Has elegido Cotización";
            case "C","c" -> "Has elegido Asistencia";
            case "D","d" -> "Has elegido Siniestros";
            case "E","e" -> "Has elegido Información de Pagos";
            case "F","f" -> "Has elegido Otras Consultas";
            case "G","g" -> "Has elegido Anulación";
            default -> "ERROR..! Opción INVALIDA.";
        };
          System.out.println(mensaje);            
        
          
        // ******   ***   Ejercicio 2   ***   ******
          
        /*
        Solicitar al usuario que ingrese dos números.
        Luego ofrecerle un menú con las siguientes opciones:
        1-suma 2-resta 3-multiplicación 4-división
        Finalmente, mostrar el resultado de la operación
        aritmética elegida.
        */
        
        
        System.out.println("\n******   Ejercicio 2   ******");
        
        System.out.print("\nPor favor ingrese el primer nro: ");
        int num1 = teclado.nextInt();        
        
        System.out.print("Por favor ingrese el segundo nro: ");
        int num2 = teclado.nextInt();
        
        System.out.println("\n1- suma 2-resta 3-multiplicación 4-división");
        System.out.print("\nElija un opción: ");
        int numero = teclado.nextInt();
        int resultado;
//        resultado = num1+num2;
//        resultado = num1-num2;
//        resultado = num1*num2;
//        resultado = num1/num2;
        
        switch (numero){
            
            case 1: resultado = num1 + num2; System.out.println("Suma: " + resultado); break;
            case 2: resultado = num1 - num2; System.out.println("Resta: " + resultado); break;
            case 3: resultado = num1 * num2; System.out.println("Multiplicación: " + resultado); break;
            case 4: resultado = num1 / num2; System.out.println("División: " + resultado); break;
            default: System.out.println("ERROR..! Opción INVALIDA.");
        }
        System.out.println("");

//        mensaje = switch (numero){
//            
//            case 1 -> "Suma: " + resultado;
//            case 2 -> "Resta: " + resultado;
//            case 3 -> "Multiplicación: " + resultado;
//            case 4 -> "División: " + resultado;
//            default -> "ERROR..! Opción INVALIDA.";
//        };
//        System.out.println(mensaje);
//        System.out.println("");        
        
    }
    
}
