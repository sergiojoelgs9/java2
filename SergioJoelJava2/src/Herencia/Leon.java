
package Herencia;


public class Leon extends Animal implements ComportamientoSonido{

    @Override
    public String haceSonido() {
        
        return "miau......!!!";
    }
    
}
