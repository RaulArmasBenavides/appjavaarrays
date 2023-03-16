package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    // Lista Generica
    List lista = new ArrayList();
    
    lista.add(345);
    lista.add(784.12);
    lista.add(0456);
    lista.add("Hola Gustavo");
    lista.add(Calendar.getInstance().getTime());
    lista.add(new Random());
    
    /*
    for(int n=1; n <= 15000; n++){
      lista.add("Que pasa");
    }
    */
    
    // Recorrido indexado
    for (int i = 0; i < lista.size(); i++) {
      Object value = lista.get(i);
      System.out.println(value);
    }
    
    lista.add("Coca Cola");
    System.out.println("----------------------");
    lista.stream().forEach(o -> System.out.println(o));
    
    lista.set(2, "Chiclayo es Chevere.");
    System.out.println("----------------------");
    
    long t1 = Calendar.getInstance().getTimeInMillis();
    lista.stream().forEach(o -> System.out.println(o));
    long t2 = Calendar.getInstance().getTimeInMillis();
    
    
    
    lista.remove(5);
    System.out.println("----------------------");
    long t3 = Calendar.getInstance().getTimeInMillis();
    for(Object o: lista){
      System.out.println(o);
    }
    long t4 = Calendar.getInstance().getTimeInMillis();
    
    System.out.println("t2 - t1: " + (t2 - t1));
    System.out.println("t4 - t3: " + (t4 - t3));
  }

  
}
