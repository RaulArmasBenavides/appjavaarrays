package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba08 {
  
  public static void main(String[] args) {
    
    List<String> nombres = new ArrayList<>();
    
    nombres.add("Gustavo");
    nombres.add("Claudia");
    nombres.add("Angel");
    nombres.add("Leonor");
    nombres.add("Carlos");
    nombres.add("Gabriel");        
    
    mostrarLista(nombres);
    
    // Ordenando con el uso lambda
    nombres.sort((o1,o2) -> o1.compareToIgnoreCase(o2));
    
    mostrarLista(nombres);
  }
  

  private static void mostrarLista(List<String> nombres) {
    System.out.println("L I S T A ORDENADA ");
    System.out.println("---------");
    nombres.forEach(s -> System.out.println(s));
  }
}

//Listas de clases 
//Vectores de clases 