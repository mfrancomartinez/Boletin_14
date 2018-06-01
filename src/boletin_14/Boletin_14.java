/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_14;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Boletin_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garaxe ex = new Garaxe();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero de plazas ocupadas");
        ex.ocupado(sc.nextInt());
        System.out.println("Inserte dinero: ");
        ex.factura(sc.nextDouble());
    }
    
}
