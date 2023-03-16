package pe.egcc.app.util;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class ArregloUtil {

  private ArregloUtil() {
  }
  
  public static void mostrarArreglo(int[] lista){
    String texto = "arreglo = {";
    for (int i = 0; i < lista.length; i++) {
      int m = lista[i];
      texto += String.valueOf(m);
      if(i < (lista.length - 1)){
        texto += ",";
      }
    }
    texto += "}";
    System.out.println(texto);
  }
  
}
