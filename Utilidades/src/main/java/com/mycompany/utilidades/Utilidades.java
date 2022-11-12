/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author nacho
 */
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);

    private static Random aleatorio = new Random();

    // leer enteros y decimales  sin errores  SCANNER (INPUTMISMATCHEXCEPTION)
    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static double leerDecimalesSinErroresScanner() {
        double num = 0.0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    //leer enteros y decimales con JOptionPane (NUMBERFORMATEXCEPTION)
    public static int leerNumeroEnteroSinErroresJOptionPane() {

        boolean repetir = true;
        int numero = 0;  // -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce el número: ");
            try {
                numero = Integer.parseInt(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return numero;
    }

    public static double leerNumeroDecimalesSinErroresJOptionPane() {

        boolean repetir = true;
        double numero = 0;  // -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce el número: ");
            try {
                numero = Double.parseDouble(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return numero;
    }

  
    // dividir enteros, si divides entre cero te da el error (ARITHMETICEXCEPTION)
      private static int dividirExcepcion(int numerador, int denominador) {
        int resultado;
        // El código susceptible de provocar la excepción se engloba en el 
        // bloque try{}
        try {
            resultado = numerador / denominador;
        } catch (ArithmeticException ae) {
            resultado = numerador;
            System.out.println("Error. Se ha intentado dividir por cero.");
        }

        return resultado;
    }
      
      
    
     //solicitud de numeros dentro de un RANGO**************************** 
      
      //pedir un numero entre un rango bucle hasta que este en el rango
    public static int leerNumeroRango(int num, int min, int max) {
        int numero = 0;
        boolean bucle = true;
        do {

            num = leerEnteroSinErroresScanner();
            if (num >= min && num <= max) {
                num = numero;
                bucle = false;
            } else {
                System.out.println("El numero esta fuera de rango");
                bucle = true;
            }

        } while (bucle);

        return numero;
    }

    // numero entero dentro de un rango 
    public static boolean numeroDentroRango(int num, int min, int max) {
        boolean rango = true;
        int numero = leerEnteroSinErroresScanner();

        if (numero >= min && numero <= max) {
            System.out.println(" El numero esta dentro del rango");

        } else {
            System.out.println("El numero esta fuera de rango");
            rango = false;
        }

        return rango;
    }

    // numeros ALEATORIOS*************************
    
    // numero aleatorio dentro de un rango
    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }
    
    
    //USO DE RANDOMSTRINGUTILS***********************************
    
    // introduzco el número de digitos aleatorios que quiero sacar (saca números) ejemplo código pin
    
    public static String  numerosAleatoiosDandoCantidadDigitos(int numeroDigitos){
     String  aleatorio ="";
    
            aleatorio=RandomStringUtils.randomNumeric(numeroDigitos);
    
    return aleatorio;
    }
    
     // introduzco el número de digitos aleatorios que quiero sacar (saca números y caracteres) ejemplo password.
    
     public static String  numerosYCaracteresAleatoiosDandoCantidadDigitos(int numeroDigitos){
     String  aleatorio ="";
    
            aleatorio=RandomStringUtils.randomAlphanumeric(numeroDigitos);
    
    return aleatorio;
    }
    
     // recibe un array de char , le damos la cantidad de caracteres que quieres sacar de ese char
     
  public static String generadorSecuencia(char[] arrayAux, int cantidadCaracteres) {
        String aux = "";
       
        aux = RandomStringUtils.random(cantidadCaracteres, arrayAux);

        return aux;
    }
}
