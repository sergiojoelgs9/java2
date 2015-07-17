
package Colletions;

import java.util.Comparator;


public class UsusarioPorNombre implements Comparator<Usuario>{

    @Override
    public int compare(Usuario A1, Usuario A2) {
   
    return (A1.getNombre().compareTo(A2.getNombre()));
    }
}
