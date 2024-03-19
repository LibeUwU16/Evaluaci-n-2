/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calificaciones_tipo_americano;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIFICACIONES_TIPO_AMERICANO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce una calificación (0 - 100)");
        califa = captu.nextInt();
        
        if((califa >= 90) && (califa <= 100))
            System.out.println("A ¡¡Aprovado!!");
        else if((califa >= 80) && (califa <= 90))
            System.out.println("B ¡¡Aprovado!!");
        else if((califa >= 70) && (califa <= 80))
            System.out.println("C ¡Aprovado!");
        else if((califa >= 60) && (califa <= 70))
            System.out.println("D Aprovado...");
        else if(califa <= 60)
            System.out.println("F Resprobado bro :(.");
        else     
            System.out.println("No es posible realizar la operación.");
            }
}
