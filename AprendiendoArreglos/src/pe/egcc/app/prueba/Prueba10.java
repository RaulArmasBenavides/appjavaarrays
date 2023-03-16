package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba10 {
  
  public static void main(String[] args) {
    
    Map<String,Object> persona = new HashMap<>();
    
    persona.put("Paterno", "Coronel");
    persona.put("Materno", "Castillo");
    persona.put("Nombre", "Gustavo");
    persona.put("Edad", 52);
    persona.put("Casado", true);
    persona.put("Ingresos", 1000.00);
    persona.put("Hijos", 5);
    persona.put("Ingresos", 5000.00);
    
    // Caso 01
    System.out.println("Caso 01");
    for(String key: persona.keySet()){
      System.out.println(key + " ==> " + persona.get(key));
    }
    
    // Caso 02: Ordenado por key
    System.out.println("\nCaso 02");
    persona.keySet().stream().sorted()
            .forEach( key -> System.out.println(key + " ==> " + persona.get(key)) );
    
  }
  
}
