package pe.egcc.app.util;

import java.util.Comparator;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class ComparaString implements Comparator<String>{

  @Override
  public int compare(String o1, String o2) {
    return o1.compareToIgnoreCase(o2);
  }
  
}
