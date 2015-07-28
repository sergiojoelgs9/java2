
package Thread;


public class TercerThread extends Thread{
        
    public void run(){ while (true) {            
            
        
        try {
            Thread.sleep(1000);
             System.out.println("Soy el tercer thread");
    
        } catch (InterruptedException e) {
        }
    }
       
   
    }
    
    
    
}
