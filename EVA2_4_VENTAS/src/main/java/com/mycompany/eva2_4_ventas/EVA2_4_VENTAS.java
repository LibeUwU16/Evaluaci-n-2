/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author 2023
 */
public class EVA2_4_VENTAS {

    public static void main(String[] args) {
        //TODO code application logic here int cantidad;
int cantidad;
int cantSald;
System.out.println("¿Cuántas piezas quieres comprar? ");
Scanner input = new Scanner(System.in);
cantidad = input.nextInt();

if(cantidad > 1000) {
cantSald = cantidad * 500;
System.out.println("Te cobro: " + cantSald );

}else
cantSald = cantidad * 800;
System.out.println("Te cobro: " + cantSald);
    }
}
