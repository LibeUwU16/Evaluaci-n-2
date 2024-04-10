/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numAlum;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuántos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        
        for (int i = 1; i < numAlum; i++) {
            System.out.print("Calificación: ");
            int califa = captu.nextInt();
        }
    }
    
}
