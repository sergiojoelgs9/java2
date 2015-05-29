
package abstraccion;


public class InterfazImc {
    public static void main (String []oso){
  
        Imc imc=new Imc(80,1.67f);
        imc.setPeso(90);
       
        System.out.println(imc.calcular());
        System.out.println(imc.getPeso());
    
        //datos primitivos integrales
        
        // -128 a 127
        byte b=1;
        short s=1;
        int i=1;
        long l=1;
   
         b=(byte)1;
         s=b;
         i=(int)l;
         i=s;
         s=(short)i;
            
         // datos primitivos decimales
        
         float fl=2.4f;
         double d=1;
         
         //datos primitivos Falso"X Defecto"/Verdadero
         boolean valor=false;
         
         Imc otro=new Imc();
         otro.setFlaco(true);
         System.out.println(otro.isFlaco());
         
         

            }}