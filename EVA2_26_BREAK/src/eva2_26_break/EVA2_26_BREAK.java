/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, pwd;
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
           Scanner captu = new Scanner(System.in);
           
    while(true){
        System.out.println("Usuario: ");
    usuario = captu.nextLine();
        System.out.println("Contraseña: ");
    pwd = captu.nextLine();
    if(usuario.equals(USUARIO)&& pwd.equals(PASSWORD))
        break;
    else
            System.out.println("Lo lamento... no has podido conectar al sistema :c");
         }  
    
        System.out.println("¡¡Bienvenido al sistema!! :D");
    
    }
    
}
