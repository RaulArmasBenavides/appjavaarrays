package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.util.ComparaString;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba07 {
  
  public static void main(String[] args) {
    
    List<String> nombres = new ArrayList<>();
    
    nombres.add("Gustavo");
    nombres.add("Claudia");
    nombres.add("Angel");
    nombres.add("Leonor");
    nombres.add("Carlos");
    
    mostrarLista(nombres);
    
    // Ordenando con el uso de una clase anonima
    nombres.sort(new ComparaString());
    
    mostrarLista(nombres);
  }
  

  private static void mostrarLista(List<String> nombres) {
    System.out.println("L I S T A");
    System.out.println("---------");
    nombres.forEach(s -> System.out.println(s));
  }
}
