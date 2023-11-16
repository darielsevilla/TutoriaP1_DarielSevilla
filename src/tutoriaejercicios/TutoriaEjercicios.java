/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoriaejercicios;

import java.util.Scanner;

/**
 *
 * @author darie
 */
public class TutoriaEjercicios {

    
    
    public static void main(String[] args) {
        /*Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = lea.nextLine();
        cadena = cadena.toLowerCase();
        String[] splitCadena = cadena.split(" ");
    
        
        for(int i = 0;i < splitCadena.length; i++){
            printArray(conversion(splitCadena[i]));
            System.out.print(" ");
        }*/
        sneakPeak();
        //System.out.print(ordenarCadena(cadena));
        
    }
    
    public static void sneakPeak(){
        Scanner lea = new Scanner(System.in);
        char[] array1 = new char[25];
        char[] array2 = new char[25];
        char[] array3 = new char[25];
        
        for(int i = 0; i < 25; i++){
            array1[i] = ' ';
            array2[i] = ' ';
            array3[i] = ' ';
        }
        
        printArray(array1);
        printArray(array2);
        printArray(array3);
        
        System.out.println("Ingrese fila: ");
        int fil = lea.nextInt();
        System.out.println("Ingrese columna: ");
        int col = lea.nextInt();
        char[] actual = new char[10];
        if(fil == 0){
            actual = array1;
        }else if(fil == 1){
            actual = array2;
        }else if(fil == 2){
            actual = array3;
        }
        
        actual[col] = 'P';
        printArray(array1);
        printArray(array2);
        printArray(array3);
        
        System.out.println("Ingrese nueva fila: ");
        fil = lea.nextInt();
        System.out.println("Ingrese nueva columna: ");
        col = lea.nextInt();
        
        for(int i = 0; i < 25; i++){
            array1[i] = ' ';
            array2[i] = ' ';
            array3[i] = ' ';
        }
        actual = new char[10];
        if(fil == 0){
            actual = array1;
        }else if(fil == 1){
            actual = array2;
        }else if(fil == 2){
            actual = array3;
        }
        actual[col] = 'P';
        printArray(array1);
        printArray(array2);
        printArray(array3);
    }
    
    public static String[] conversion(String parametro){
        String[] returnArray = new String[parametro.length()];
        for(int i = 0; i < parametro.length(); i++){
            char actual = parametro.charAt(i);
            if((int)actual >= 97 && (int)actual <= 122){
                int convertido = (int)actual - 96;
                returnArray[i] = Integer.toString(convertido);
            }else{       
                char nuevo = (char)((int)actual + 48);
                returnArray[i] = Character.toString(nuevo).toUpperCase();  
                
            }
        }
        return returnArray;
    }
    
    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print("-");
            }
        }
    }
    
    public static void printArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }
    
    public static int[] llenarArreglo(){
        int[] sacar = new int[10];
        Scanner lea = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese numero " + (i+1) + ": ");
            sacar[i] = lea.nextInt();
        }
        return sacar;
    }
    
    public static String ordenarCadena(String parametro){
        String respuesta = "";
        int cuantosEnteros = 0;
        for(int i = 97; i <= 122; i++){
            for(int j = 0; j < parametro.length(); j++){
                int ascii = (int)parametro.charAt(j);
                
                if(ascii == i){
                    respuesta += parametro.charAt(j);
                }
            }
            
        }
        
        for(int i= 0; i < parametro.length(); i++){
           int ascii = (int)parametro.charAt(i);
           if(ascii >= 48 && ascii <= 57){
               cuantosEnteros++;
           }
        }
        System.out.println("Cantidad de enteros encontrados: " + cuantosEnteros);
        return respuesta;
    }
    
 
    
}
