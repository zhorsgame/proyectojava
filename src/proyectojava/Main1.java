
package proyectojava;


public class Main1 {

    
    public static void main(String[] args) {
        String[] nombre = {"Luis","Miguel","Carlos"}; //Declarar un array tipo cadena
        //Recorer el array
        
        for(int i=0; i<nombre.length; i++){
            System.out.println(nombre[i]);
        }
        
        double[] estatura = {1.72,1.75,1.65};
        for(int i=0; i<estatura.length; i++){
            System.out.println(estatura[i]);
        }
    }
    
}
