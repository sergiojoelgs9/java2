
package Herencia;

public abstract class Animal{
    //abstract es un modificador para la clase Animal, tambien no se puede crear un ojeto afuera de ella "Animal animal=new Animal();"
   
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
