
package Colletions;

import java.util.ArrayList;
import java.util.List;
//paqueteria lista
//paquteria de array list
//tienen clases y metodos de ordenamiento
//tiene el potencial de usarse para construir prototipos de base de datos NO SQL 
//arreglos mutables:pueden cambiar de tamaño en timepo de ejecucion

public class GeneradorUsuarios {
    
        public GeneradorUsuarios() {
        Usuario u1=new Usuario("Jason",23,"brody@hotmail.com");
        Usuario u2=new Usuario("lara",22,"croft@outlook.com");
        Usuario u3=new Usuario("jericho",21,"jerico@gmail.com");
        Usuario u4=new Usuario("daisy",21,"lee@gmail.com");
         
        usuarios=new ArrayList<>();
          usuarios.add(u1);
          usuarios.add(u2);
          usuarios.add(u3);
          usuarios.add(u4);
          }
       
    //Encapsulacion de lista de usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
          }
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //constructor General
    private List<Usuario> usuarios; 
    
    public String agregarUsuarios(String nombre,int edad,String email){
    Usuario u=new Usuario(nombre, edad, email);
    usuarios.add(u);
     return "usuario agragado con exito";
    }
    
}
