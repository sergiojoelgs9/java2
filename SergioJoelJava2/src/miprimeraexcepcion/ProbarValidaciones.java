
package miprimeraexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarValidaciones {

    public static void main(String[] args) {
      
        try {
            int edad=20;
            System.out.println("Vamos a validar tu edad");
            //con el static ya aparece .ValidarEdad(); sin crear la clase
            ValidarEdad.ValidarEdad(edad);
        } catch (MenordeEdadexception ex) {
         
        }
        
       
    }
    
}
