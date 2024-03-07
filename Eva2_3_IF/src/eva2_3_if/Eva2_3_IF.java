/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double califa;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce una calificación:");
    califa = captu.nextDouble();
    if(califa >=70) { //esta sección --> true
    // {} opcionales,solo cuando tenemos más
    //de una instrucción
    System.out.println("Aprobado");
} else { // la evaluación false es opcional
    System.out.println("No Aprobado");     
       }
    
        }
    }
    

