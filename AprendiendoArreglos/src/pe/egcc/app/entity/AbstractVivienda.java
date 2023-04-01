/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.entity;
import java.io.PrintWriter;

/**
 *
 * @author dyarm
 */
public abstract class AbstractVivienda {
    private double area;
    private double precio;
    private double adicional;
    private double total;
    private double amocoche;

    /*public AbstractVivienda(double area, double precio, double adicional, double total, double amocoche) {
        this.area = area;
        this.precio = precio;
        this.adicional = adicional;
        this.total = total;
        this.amocoche = amocoche;
    }*/

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAmocoche() {
        return amocoche;
    }

    public void setAmocoche(double amocoche) {
        this.amocoche = amocoche;
    }
    
    public abstract void CalcularAdicional();
    
    public void calcularPrecio(){
         if(area <= 100){
             precio = 200;
        }
         else if (area <= 2000){
             precio = 270;        
        }
         else{
             precio = 310;
        }
         
    }
     
    public void calcularTotal(){
        total = precio + adicional;
    }
    public void imprimir(){
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Precio" +precio);
        p.println("Area" +area);
        p.println("Adicional" +adicional);
        
    }
}
