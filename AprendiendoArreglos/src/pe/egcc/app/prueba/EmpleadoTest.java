/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.prueba;

import pe.egcc.app.entity.Docente;
import pe.egcc.app.entity.JefedePracticas;

/**
 *
 * @author dyarm
 */
public class EmpleadoTest {
    
    
      public static void main(String[] args) {
                
          //
          Docente d = new Docente("MATEMATICA","raul","armas","M","73262442");
          
          String resultado_docente = d.MostrarInfo();
          System.out.println(resultado_docente);
          
          JefedePracticas j  = new  JefedePracticas("un","sofia","lujan","F","46494");
          
          String resultado_jefep = j.MostrarInfo2();
          System.out.println(resultado_jefep);
        }
}
