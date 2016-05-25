/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ed.ulacit.cicc.geometria.figuras;

/**
 *
 * @author CICC
 */
public class Circulo {
    private int radio;
    
    public Circulo (int pRadio) { 
    
        if (pRadio>0) {
            this.radio= pRadio;
        } // End if  
        else {
           radio=1;
           
        } // End else 
    } // End constructor 
    
    public int getDiametro(){
        return (2*radio); 
        
    } // End metodo de diametro 
        
    public double getArea () {
        return (Math.PI*Math.pow(radio, 2)); 
        
    } // End metodo de area 
    
} // End Clase
    
