
package Herencia;

public class Zoologico {

    public static void main(String[] args) {
       
        /* Animal ya es una clase abtracta, No se pude heredar de ella y tambien crear objetos a partir de ella
        Animal zoo=new Animal();
        zoo.setEdad(2);
        zoo.setNombre("Rareza");
        */
        
        Tortuga turtle1=new Tortuga();
        turtle1.setNombre("Galapajos");
        turtle1.setEdad(2);
        
        Leon leon1=new Leon();
        leon1.setNombre("Albino");
        leon1.setEdad(20);
        
        
        
     
    }
    
}
