/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.utilidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);

    private static Random aleatorio = new Random();

    // leer enteros sin errores 
    public static int leerEnteroSinErrores() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (NumberFormatException nfe) {
                System.out.println("No has introducido un numero entero");

            }

        } while (repetir);

        return num;
    }
    
    //pedir un numero entre un rango bucle hasta que este en el rango
    
    public static int leerNumeroRango(){
    numero=0;

   return numero;
}
    
    
    
    
    

    
    // numero entero dentro de un rango 
    
    public static boolean numeroDentroRango(int num, int min, int max){
    boolean rango = true;
    int numero= leerEnteroSinErrores();
            
        if (numero>=min && numero <= max){
            System.out.println(" El numero esta dentro del rango");
        
        }else {
            System.out.println("El numero esta fuera de rango");
            rango=false;
        }
    
    
    
    
    return rango;
    }
    
    
    
    
    
}
