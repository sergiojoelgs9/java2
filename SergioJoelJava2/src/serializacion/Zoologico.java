
package serializacion;


public class Zoologico {
    public static void main(String[] args) throws Exception{
        ModeloPersistenciaAnimal m=new ModeloPersistenciaAnimal();
        Animal a=m.buscarTodos();
        System.out.println(a.getNombre());
        
    }
    
}
