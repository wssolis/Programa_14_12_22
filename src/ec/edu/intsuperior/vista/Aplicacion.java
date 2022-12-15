/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Chocolate;
import ec.edu.intsuperior.modelo.Telefono;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese marca, peso, tipo");
        Chocolate ch1= new Chocolate(leer.next(), leer.next(), leer.next());
        System.out.println("Ingrese marca, peso, tipo");
        Chocolate ch2= new Chocolate(leer.next(), leer.next(), leer.next());
        
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
    }
    
}
