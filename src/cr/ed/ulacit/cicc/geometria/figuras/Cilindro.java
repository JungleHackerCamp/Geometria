/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ed.ulacit.cicc.geometria.figuras;

/**
 *
 * @author pedro
 */
public class Cilindro {
    
    private Circulo base;
    private int altura;
    
    public Cilindro(int pRadio, int pAltura){
        
        if(pRadio >0 && pAltura >0){
            this.altura = pAltura;
            this.base = new Circulo(pRadio);
        }
        else{
            this.altura = 1;
            this.base = new Circulo(1);
        }
        
    } // FIN CONSTRUCTOR
    
    public double getVolumen(){
        return this.base.getArea()*this.altura;
    }
    
}
