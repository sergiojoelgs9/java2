
package Herencia;

public class Zoologico {

    public static void main(String[] args) {
       
        /* Animal ya es una clase abtracta, No se pude heredar de ella y tambien crear objetos a partir de ella
        Animal zoo=new Animal();
        */
        
        //Nota: ccrea herencia nombre y edad
       
        Tortuga turtle1=new Tortuga();
        turtle1.setNombre("Galapajos");
        turtle1.setEdad(2);
        
        Leon leon1=new Leon();
        leon1.setNombre("Albino");
        leon1.setEdad(20);
        
        Pollo chiken1=new Pollo();
        chiken1.setNombre("gallina");
        chiken1.setEdad(10);
        
        Delfin dolphin1=new Delfin();
        dolphin1.setNombre("delfin rosado");
        dolphin1.setEdad(5);
        
        //Arreglo de ComportamientoSonido de tres animales, imprimir los ruidos de los animales con el for mejorado
        
       ComportamientoSonido comportamiento[]=new ComportamientoSonido[3];
       
       comportamiento[0]=leon1;
       comportamiento[1]=dolphin1;
       comportamiento[2]=chiken1;
    
       
       
           for (ComportamientoSonido cs: comportamiento) {
           System.out.println(cs.haceSonido());
            
        }
      
        
        
    }
    
}
