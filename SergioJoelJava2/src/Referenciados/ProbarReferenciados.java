
package Referenciados;

public class ProbarReferenciados {

    
    public static void main(String[] args) {
                
        //crear la clase wrapper integer y la guarda en una clase String
    Integer entero=new Integer("4");
    
    //bug:es basura o bicho al momento de a¿hacer opreaciones matematicas y coloas un valor que no es numero o sintaxis no requerida
    // Integer entero=new Integer("-,bug%&");
    
    //crear la clase wrapper flotante y la guarda en una clase String
    Float flotante=new Float("7.1");
    
   //opreacion primitiva
    
    float opreacion=entero+flotante;
        System.out.println(opreacion);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
