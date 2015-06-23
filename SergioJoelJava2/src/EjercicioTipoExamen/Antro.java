
package EjercicioTipoExamen;

public class Antro {

    public static void main(String[] args) {
        
      Direccion d1=new Direccion("ecatepc", 50130); 
      Usuario u1=new Usuario("juan", 42, "jcampos@gmail.com",d1);
       
      //invocacion de metodos por cadena
        System.out.println(u1.getDireccion().getMunicipio());
    }
    
}
