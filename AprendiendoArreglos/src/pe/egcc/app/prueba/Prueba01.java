package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    int[] lista = new int[5];
    
    // Acceso indexado
    for (int i = 0; i < lista.length; i++) {
      int m = lista[i];
      System.out.println("lista[" + i + "] = " + m);
    }
    
    lista[2] = 20;
    lista[0] = 5;
    lista[3] = lista[0] * lista[2];
    
    // Acceso tipo colección (for each)
    System.out.println("\nRecorrido tipo colección");
    for (int valor : lista) {
      System.out.println(valor);
    }
  }
}
