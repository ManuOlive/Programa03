/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa03;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, x=1;
        Scanner entrada = new Scanner (System.in);
        while(x==1){
        System.out.println("¿Cual es tu edad? ");
        edad=entrada.nextInt();
        if (edad>=18){
            System.out.println("¡¡Eres mayor de edad!!");
        }
        else{
            System.out.println("¡¡Eres menor de edad!!");
        }
        }
    }
    
}
