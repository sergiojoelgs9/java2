
package Colletions;

import java.util.ArrayList;


public class ProbarColletions {

    public static void main(String[] args) {
        
        GeneradorUsuarios generador=new GeneradorUsuarios();
        generador.agregarUsuarios("jericho", 3, "jericho@othail.com");
        //nos regresa el listado de ususario
        
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generador.getUsuarios();
        System.out.println(usuarios.size());
        
        
        
        for (Usuario u : usuarios) {
            System.out.println("Nombre"+u.getNombre()+"edad"+u.getEmail()+"Email");
            
        }
      
    }
    
}
