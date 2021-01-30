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
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {5,25,36,2,14,25,3,1};
        int [] numeros2 = new int[numeros.length];
        System.arraycopy(numeros , 0, numeros2, 0, numeros.length);
        System.out.println("Array 1");
        for(int i=0;i<numeros.length;i++){
            
            System.out.print("Array 1 :"+numeros[i]+",");
        }
        System.out.println(" ");
        System.out.println("Array 2");
        for(int z=0;z<numeros2.length;z++){
            
            System.out.print("Array 2 :"+numeros2[z]+",");
        }
    }
    
}
