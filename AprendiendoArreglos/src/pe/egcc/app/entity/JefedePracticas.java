/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.entity;

/**
 *
 * @author dyarm
 */
public class JefedePracticas extends AbstractPersona{
        protected String uni;

    public JefedePracticas(String uni, String nombre, String apellido, String sexo, String dni) {
        super(nombre, apellido, sexo, dni);
        this.uni = uni;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
    
    //sobreescribe para los hijos diferentes 
    @Override
    public String MostrarInfo(){
        return "Mostrar informacion de jefe de practicas";
    }
    
    //llama al método del padre 
    public String MostrarInfo2(){
        //..
      return super.MostrarInformacion2();
      // return "Hola mundo";
    }
    
}
