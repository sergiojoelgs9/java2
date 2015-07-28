
package Thread;

import java.util.Calendar;


public class ThreadPolimorfico implements Runnable{

    public static void main(String[] args){
    Runnable r=new ThreadPolimorfico();
    Thread t1=new Thread(r);
    t1.start();
    }
   
    @Override
    public void run(){while (true) {            
        
try {
            Thread.sleep(1000);
            //vamos a crear un relojito
            Calendar cal=Calendar.getInstance();
            
            int hora=cal.get(Calendar.HOUR);
            int min=cal.get(Calendar.MINUTE);
            int seg=cal.get(Calendar.SECOND);
            int milseg=cal.get(Calendar.MILLISECOND);
            System.out.println(hora+":"+min+":"+seg);
            
} catch (Exception e) {     

}}}}
