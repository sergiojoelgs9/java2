
package abstraccion;


public class Imc {
    float peso;
    float altura;

    public Imc(float p, float a) {
        
        peso=p;
        altura=a;
    }
    
    
    
    public float calcular(){
    
        float imc=peso/(altura*altura);
        return imc;
    }
    
}
