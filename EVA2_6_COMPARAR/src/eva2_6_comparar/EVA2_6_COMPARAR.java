/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CUAL ES EL MAYOR VALOR ENTRE DOS NÚMEROS
        // PIDAN AL USUARIO DOS VALORES ENTEROS
        
        int valor1, valor2;
        Scanner captu = new Scanner(System.in);

        System.out.println("Valor 1");
        valor1 = captu.nextInt();
        System.out.println("Valor 2");
        valor2 = captu.nextInt();
        
        //CUAL ES EL MAYOR
        if(valor1 > valor2)
            System.out.println(valor1 +" Es mayor");
        else
            if(valor1 == valor2) //valor1 es igual que valor2?
                System.out.println("Son iguales");
        else
            System.out.println(valor2 +" Es mayor");
    }
    
}
