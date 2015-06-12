
package Herencia;


public class Pollo extends Animal implements ComportamientoSonido{
    
    //Clase del tipo del animal utilizamos la herencia de las clase Animal "extends" 
    //Implentamos con la interface ComportamientoSonido  "implements" con Override
    //Utilizamos la herencia de Animal con getNombre() para colocar el nombre del animal cuando hace el ruido
    
    @Override
    public String haceSonido() {
        
        return "pio pio......!!!"+getNombre();
    
    }
    
    
    
    
}
