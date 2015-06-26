package Arreglo;

public class ProbarArreglos {
   
    public static void main(String[] args) {

        //diferentes tipos de arreglos
        
        //A(
       int x[]={1,45,-12,4}; 
       //B)
       int []y=new int[13];
       y[1]=43;
       y[2]=12;
       y[3]=24;
        //C)
       int z[]=new int[]{3,12,4};
       String hola="hola";
       
        //for simple
            for(int i=0;i<x.length;i++){
                
        //imprime el arreglo 
            System.out.println("este elementp tiene un valor de:"+x[i]);   
            
         //for mejorado
         for(int m:x){
             System.out.println("Este valor tiene un valor de"+m);
             
         }
         
         //imprime "hola" en codigo ASCII 
            byte []xx=hola.getBytes();
            for(byte mm:xx)
                System.out.println(mm);
          
            
         //imprime "hola" con un castin forzado  
            byte []yy=hola.getBytes();
            for(byte mm:yy)
                System.out.println((char)mm);
            
              
       for(int m:x){
             System.out.println("Este valor tiene un valor de"+m);
             
         }
            
            
            
    }
            
   
      
      
            
    }
    
}
