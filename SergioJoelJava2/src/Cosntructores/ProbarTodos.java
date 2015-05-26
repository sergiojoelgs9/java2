
package Cosntructores;

import javax.swing.JFrame;
import javax.swing.*;


public class ProbarTodos {

    //void es un metodo sin retorno fisicamente
    public static void main(String[] args) {
        
     
        //Test1:referencia clase  objeto1:objeto New:crear objetos anonimos  Test1():instancia del constructor
        //los constructores funcinan si ya se coloco los valores de la clase test1
        Test1 objeto1=new Test1(3);
        Test1 objeto2=new Test1();
        
        //constructor Frame "ventana"
        JFrame ventana=new JFrame("Mi ventana");
        //dar ordenes set tamaño size(alto,ancho)
        ventana.setSize(400,400);
        //hacerla visible
        ventana.setVisible(true);
    }
    
}
