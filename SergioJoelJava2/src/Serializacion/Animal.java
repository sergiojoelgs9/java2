//clase POJO
package Serializacion;
//compresor

import java.io.*;
//entrad y salida serializable

public class Animal implements Serializable{
    //implemtamos la serializaion
   private String nombre;
   private boolean carnivoro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
}
