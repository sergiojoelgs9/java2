
package miprimeraexcepcion;

public class ValidarEdad {
    
    //validar: Es parte de un modelo:contiene logica aplicada a entidades y es un "POJO'S" no se coloca en una Main Class 
    //Main: Aqui normalmente se crea  de las 
    //Entidades: Objeto que va atrabajar en tu aplicacion "APP" 
    //Model: logica entre objeto
    //Ejecucion: objetos de las anteriodes 
    
    public static void ValidarEdad(int edad)throws MenordeEdadexception{
        // Static: Es un ejecutador no necesita un objeto para invocarlo "diferente del NEW" 
        //lanzar la excepcion edad "throws MenordeEdadexception"
        //si edad es menor a 18 lanzar la excepcion
        if (edad<18)throw new MenordeEdadexception();
            
        
    
        
        
    }    
    
    
    
    
    
    
}
