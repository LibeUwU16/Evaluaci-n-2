/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_operadores_lógicos;

/**
 *
 * @author invitado
 */
public class EVA2_2_OPERADORES_LÓGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      boolean valBol1, valBol2;
valBol1 = false;
valBol2 = false;
boolean A, B;
A = false;
B = false;
boolean resu;

resu = A && B;
System.out.println("Resu =" + resu);
A = true;
B = false;
resu = A && B;
System.out.println("Resu =" + resu);
A = true;
B = true;
resu = A && B;
System.out.println("Resu =" + resu);
//VERDADERO O FALSO
A = false;
B = false;
resu = A || B;
System.out.println("Resu (or) =" + resu);
A = true;
B = false;
resu = A || B;
System.out.println("Resu (or) =" + resu);
//NEGACIÓN
A = false;
resu = !A;
        System.out.println("Resu (!) =" + resu);
A = true;
resu = !A;
        System.out.println("Resu (!) =" + resu);
    }
    
}
