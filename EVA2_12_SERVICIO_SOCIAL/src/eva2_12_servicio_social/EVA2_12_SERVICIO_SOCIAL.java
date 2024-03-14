/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_SERVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int creditos, semestre;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Qué semestre esta cursando?");
        semestre = captu.nextInt();
        System.out.println("¿Cuántos créditos lleva?");
        creditos = captu.nextInt();
        
        if((semestre >= 6) && (creditos >= 150) )    
            System.out.println("Puedes realizar elservicio social.");
        else
            System.out.println("No es posible realizar tu servicio social.");
    }
    
}
