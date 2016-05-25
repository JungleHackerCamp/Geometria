/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ed.ulacit.cicc.geometria;

import cr.ed.ulacit.cicc.geometria.figuras.Cilindro;
import cr.ed.ulacit.cicc.geometria.figuras.Circulo;

/**
 *
 * @author pedro
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c1 = new Circulo(15);
        
        Cilindro cin1 = new Cilindro(40, 100);
        
        System.out.println("Diámetro del círculo es: " + c1.getDiametro());
        System.out.println("Diámetro del círculo es: " + c1.getArea());
        
        System.out.println("El volumen del cilindro es: " + cin1.getVolumen());
        
    }
    
}
