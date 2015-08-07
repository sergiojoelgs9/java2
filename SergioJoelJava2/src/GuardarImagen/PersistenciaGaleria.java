
package GuardarImagen;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaGaleria {
    
    ArrayList<Galeria> galeria=new ArrayList<Galeria>();
    public void guardar(Galeria g)throws Exception{
    File f=new File("Media");
        if (f.exists()) {
            galeria=leeTodas();
            
        }
       FileOutputStream fis=new FileOutputStream(f);
       ObjectOutputStream oos=new ObjectOutputStream(fis);
       galeria.add(g);
       oos.writeObject(galeria);
        System.out.println("Datos de la guardar exitosa");
    
    }
    public ArrayList<Galeria> leeTodas()throws Exception{
    File f=new File("Media");
    FileInputStream fis=new FileInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
    galeria=(ArrayList<Galeria>)ois.readObject();
    return galeria;
    
    }
    
}
