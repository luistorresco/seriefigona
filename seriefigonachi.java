/*
hacer un algoritmo que genere e imprima los n primeros terminos de la serie fibonachi
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class JavaApplication1 {

    /**
     */
    public static void main(String[] args) {
        //definiion de varianles y objetos 
        Scanner objeread=new Scanner(System.in);
        int num1=0, num2=1, num3, n;
        System.out.println("\n cuantos elementos tiene la serie?  ");
        n=objeread.nextInt();
        //leer la cantidad de elementos de la serie
        System.out.println("\n elementos de la serie \n");
        System.out.print (num1 + " " + num2 + " " );
        for (int i = 3; i <=n; i++) {
            num3=num1 + num2;
            System.out.println(num3 + " " );
            num1=num2;
            num2=num3;
        }//fin para 
    }
}
    

