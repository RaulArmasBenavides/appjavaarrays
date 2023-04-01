/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.entity;

/**
 *
 * @author dyarm
 */
public class Docente  extends AbstractPersona{
        public String materia;

    public Docente(String materia, String nombre, String apellido, String sexo, String dni) {          
        super(nombre, apellido, sexo, dni);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String MostrarInfo(){
        return "Este es el mensaje del docente";
    }
}
