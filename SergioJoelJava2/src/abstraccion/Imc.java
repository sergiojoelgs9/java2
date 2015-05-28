
package abstraccion;


public class Imc {
    
    
    //atributos*****************************************************************
    private float peso;
    private float altura;
   
    // constructor por defecto**************************************************
    public Imc() {
    }

    
    public Imc(float p, float a) {
        peso=p;
        altura=a;
    }
    
    
    public float calcular(){
    float imc=peso/(altura*altura);
     return imc;
    }
        
    //Encapsulacion de los atributos********************************************

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
