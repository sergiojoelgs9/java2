
package Thread;

import java.util.Calendar;

public class RelojitoMejorado {
   
    public static void main(String[] args) {
      
         Thread t1=new Thread(new Runnable(){
        @Override
        public void run(){             
        
try {
            Thread.sleep(1000);
            //vamos a crear un relojito
            Calendar cal=Calendar.getInstance();
            
            int hora=cal.get(Calendar.HOUR);
            int min=cal.get(Calendar.MINUTE);
            int seg=cal.get(Calendar.SECOND);

            System.out.println(hora+":"+min+":"+seg);
            
} catch (Exception e) {     

} }});
t1.start();   
    }    
}
    
    
    

