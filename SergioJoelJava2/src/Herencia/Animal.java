
package Herencia;

public abstract class Animal{
    //abstract es un modificaor np se puede crear un ojeto afuera de ella
   
    private String nombre;
    private int edad;
    
    //constructor
    public Animal() {
    }
    
    //encapsulacion
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
