
package EjercicioTipoExamen;



class Bebida {
    
    
  private String tipo;
  private String []bebidas;
  
  //arreglo de string
  public String [] obtenerRecomendacion(){
      if (tipo.equals("Alcoholicas")) {
          String []alcohol={"cerveza","vino","Tequila","Pulque","Whisky"};
          return alcohol;
         
      }else{
      
       String []sinAlcohol={"Agua","Coca-Cola","Agua Mineral","Sangria"};
       return sinAlcohol;
      } 
  
  }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    
  

}






