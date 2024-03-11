/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (°C):");
        temp = captu.nextInt();
        //VAMOS A EVALUAR
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
        
    }
    
}
