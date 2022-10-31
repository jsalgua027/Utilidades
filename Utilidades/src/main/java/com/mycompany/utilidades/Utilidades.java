/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.utilidades;

import java.util.InputMismatchException;
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

            } catch( InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    //pedir un numero entre un rango bucle hasta que este en el rango
    public static int leerNumeroRango(int num, int min, int max) {
          int  numero=0;
          boolean bucle= true;
        do {
           
            num = leerEnteroSinErrores();
            if (num>= min&& num<=max){
            num=numero;
            bucle=false;
            }else{
                System.out.println("El numero esta fuera de rango");
            bucle=true;
            }
            

        } while (bucle);

        return numero;
    }

    // numero entero dentro de un rango 
    public static boolean numeroDentroRango(int num, int min, int max) {
        boolean rango = true;
        int numero = leerEnteroSinErrores();

        if (numero >= min && numero <= max) {
            System.out.println(" El numero esta dentro del rango");

        } else {
            System.out.println("El numero esta fuera de rango");
            rango = false;
        }

        return rango;
    }
    
    // numero aleatoiro dentro de un rango
    
    public static int aleatorioDentroRango(int min, int max){
    int numeroGenerado;
    
    numeroGenerado=aleatorio.nextInt(max-min+1)+min;
    
    return  numeroGenerado;
    
    }
    
    

}
