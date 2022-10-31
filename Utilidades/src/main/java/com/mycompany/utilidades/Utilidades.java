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

    private static Scanner  teclado= new Scanner(System.in);
    
    private static Random aleatorio = new Random();
    
    
    // leer enteros sin errores 
    
    public static int leerEnteroSinErrores(){
        int num=0;
        
        try {
            System.out.println("Introduce el numero entero");
            
            
        } catch (Exception e) {
        }
        
        
    
    
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
