
package Colletions;

import java.util.ArrayList;
import java.util.List;
//paqueteria lista
import  java.util.ArrayList;
//paquteria de array list

//arreglos mutables:pueden cambiar de tamaño en timepo de ejecucion

public class GeneradorUsuarios {
    
    
    //getters and setters de lista de usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

//constructor general
    public GeneradorUsuarios() {
        Usuario u1=new Usuario("Sergio",23,"sergio@hotmail.com");
        Usuario u2=new Usuario("joel",22,"joel@outlook.com");
        Usuario u3=new Usuario("jericho",21,"jerico@gmail.com");
usuarios=new ArrayList<>();

    }
    
    
List<Usuario> usuarios; 
    
    
}
