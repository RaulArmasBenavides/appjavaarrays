package pe.egcc.app.prueba;

import pe.egcc.app.util.ArregloUtil;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    int[] lista = new int[10];
    
    ArregloUtil.mostrarArreglo(lista);

    lista[2] = 23;
    lista[5] = 20;
    lista[8] = 30;
    
    ArregloUtil.mostrarArreglo(lista);
    
    int lista2[] = {43,28,43,12};
    
    ArregloUtil.mostrarArreglo(lista2);
  }
}
