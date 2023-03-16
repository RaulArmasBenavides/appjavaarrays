package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    String[] ciudades = new String[6];
    
    for (int i = 0; i < ciudades.length; i++) {
      String valor = ciudades[i];
      System.out.println("ciudades[" + i + "] = " + valor);
    }
    
    ciudades[0] = "Chiclayo";
    ciudades[1] = "Cuzco";
    ciudades[3] = "Huancayo";
    ciudades[4] = "Arequipa";
    ciudades[5] = "Chachapoyas";
    
    for (int i = 0; i < ciudades.length; i++) {
      String valor = ciudades[i];
      System.out.println("ciudades[" + i + "] = " + valor);
    }
    
    ciudades = new String[]{"Lima","Buenos Aires","Quito","Bogota"};
    
    for (int i = 0; i < ciudades.length; i++) {
      String valor = ciudades[i];
      System.out.println("ciudades[" + i + "] = " + valor);
    }
  }
}
