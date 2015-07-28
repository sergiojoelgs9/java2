
package Thread;

//heredando la clase thread

public class PrimerTherad extends Thread{
  
    
    public void run(){ while (true) {            
            
        
        try {
            Thread.sleep(1000);
             System.out.println("Soy el primer thread");
    
        } catch (InterruptedException e) {
        }
    }
       
   
    }
    
}
