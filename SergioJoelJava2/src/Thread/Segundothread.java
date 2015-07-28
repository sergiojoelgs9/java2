
package Thread;


public class Segundothread extends Thread{
    
    
        public void run(){ while (true) {            
            
        
        try {
            Thread.sleep(1000);
             System.out.println("Soy el Segundo thread");
    
        } catch (InterruptedException e) {
        }
    }
       
   
    }
    
}
