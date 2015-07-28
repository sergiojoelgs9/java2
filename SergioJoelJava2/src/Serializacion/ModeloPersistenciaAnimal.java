//clase tipo modelo "logica"
//Persistencia Guardar

package Serializacion;

import java.io.*;

public class ModeloPersistenciaAnimal {
    
    public void guardar(Animal animal)throws Exception{
        //paso 1 crear el archivo deonde se guarda el animal
        
    File file=new File("E:\\Animalitos.xxx");
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(oos);
    System.out.println("Guradado con exito");
    }
       
}
