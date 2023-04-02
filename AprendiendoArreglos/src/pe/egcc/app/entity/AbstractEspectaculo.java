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
public abstract class AbstractEspectaculo {
    private double precio; //calcular en las subclases
    private double incremento; //calcular en las subclases
    private double impuesto; //calcular
    private double total; //calcular
    private char ubicacion; //ingresar

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    abstract public void calcularPrecio();
    abstract public void calcularIncremento();
    
    public void calcularImpuesto(){
        impuesto = 0.11*precio;
    }
    
    public void calcularTotalNeto(){
        total=precio+incremento+impuesto;
    }
    
    public void imprimir(){
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Precio" +precio);
        p.println("unicacion" +ubicacion);
        p.println("incremento" +incremento);
        p.println("impuesto" +impuesto
        );
    }
    
}
