
package miprimeraexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarValidaciones {

    public static void main(String[] args) {
      
        try {
            int edad=9;
            System.out.println("Vamos a validar tu edad");
            //Con el Static aparece el metodo .ValidarEdad(); sin crear la clase
            
            ValidarEdad.ValidarEdad(edad);
            System.out.println("Eres mayor de Edad");
            //lanza la excepccion si es correct
            
        } catch (MenordeEdadexception ex) {
            System.out.println(ex.getMessage());
         
        }catch(NumberFormatException ex){
            //exception de numerico
            System.out.println("No se aceptan caracteres de escritura solo numerico");
        }
        
       
    }
    
}
