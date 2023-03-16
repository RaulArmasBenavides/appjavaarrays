package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba09 {
  
  public static void main(String[] args) {
    
    List<String> nombres = new ArrayList<>();
    
    nombres.add("Gustavo");
    nombres.add("Claudia");
    nombres.add("Angel");
    nombres.add("Leonor");
    nombres.add("Carlos");
    
    System.out.println("L I S T A  ORDEN ASCENDENTE");
    nombres.stream().sorted().forEach(s -> System.out.println(s));
    
    System.out.println("L I S T A  ORDEN DESCENDENTE");
    nombres.stream()
            .sorted((o1,o2) -> o2.compareToIgnoreCase(o1))
            .forEach(s -> System.out.println(s));
    
  }
  
}
