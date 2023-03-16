package pe.egcc.app.prueba;

import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Stream;
import pe.egcc.app.util.ArregloUtil;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    
    int[] lista = {48,12,43,18};
    Arrays.stream(lista).forEach(n -> System.out.println(n));
    System.out.println("Suma: " + Arrays.stream(lista).sum());
    System.out.println("Mayor: " + Arrays.stream(lista).max());
    System.out.println("Menor: " + Arrays.stream(lista).min());
    System.out.println("Tamaño: " + Arrays.stream(lista).count());
    System.out.println("Promedio: " + Arrays.stream(lista).average());

    
  }
}
