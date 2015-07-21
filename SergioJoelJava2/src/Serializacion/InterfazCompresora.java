
package Serializacion;


public class InterfazCompresora {
    public static void main(String[] args) {
     //crwamos un animal
        
        Animal a=new Animal();
        a.setNombre("Leon");
        a.setCarnivoro(true);
        
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try {
            modelo.guardar(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
        
}
