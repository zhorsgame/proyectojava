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
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {5,25,36,2,14,25,3,1};
        int mayor = -9999;
        int menor = 9999;
        for(int i=0; i<numeros.length; i++){
            if(mayor<numeros[i]) mayor = numeros[i];
            if(menor>numeros[i]) menor = numeros[i];
        }
        System.out.println("Mayor:"+mayor);
        System.out.println("Menor:"+menor);
    }
    
}
