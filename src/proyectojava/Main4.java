/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

/**
 *
 * @author juanmi
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {5,4,4};
        double promedio =0;
        for(int i=0; i<numeros.length; i++){
            promedio = promedio + numeros[i];
        }
        double n = numeros.length;
        promedio = promedio/n;
        System.out.println("promedio:"+promedio);
        
    
    }
    
}
