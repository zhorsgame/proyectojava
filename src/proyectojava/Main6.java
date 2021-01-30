
package proyectojava;

/**
 *
 * @author juanmi
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Luis","Miguel","Carlos","Juan","Pepe"};
        String[] nombres2 = {"Nerea","Aitana","Lucia","Sara","Catalina","Lara","Lupe","Lucrecia","Andrea"};
       
        System.arraycopy(nombres , 0, nombres2, 4, nombres.length);
        
        System.out.println("Array 2");
        for(int z=0;z<nombres2.length;z++){
            
            System.out.print("Array 2 :"+nombres2[z]+",");
        }
    }
    
}
