package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba06 {
  
  public static void main(String[] args) {
    
    List<String> nombres = new ArrayList<>();
    
    nombres.add("Gustavo");
    nombres.add("Claudia");
    nombres.add("Angel");
    nombres.add("Leonor");
    nombres.add("Carlos");
    
    mostrarLista(nombres);
    
    // Ordenando con el uso de una clase anonima
    nombres.sort(new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
      }
    });
    
    mostrarLista(nombres);
  }
  

  private static void mostrarLista(List<String> nombres) {
    System.out.println("L I S T A");
    System.out.println("---------");
    nombres.forEach(s -> System.out.println(s));
  }
}
