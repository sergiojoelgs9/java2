
package Thread;


public class ProbarThread {
    
    public static void main(String[] args) {
        //creamos el thread
        PrimerTherad t1=new PrimerTherad();
        Segundothread t2=new Segundothread();
        TercerThread t3=new TercerThread();
        //lo ponemos en estado inicializado
        t1.start();
        t2.start();
        t3.start();
        //viene dado por el metodo RUN
        
        
    
    }
    
}
