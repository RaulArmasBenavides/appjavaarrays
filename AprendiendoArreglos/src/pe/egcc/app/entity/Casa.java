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
public class Casa extends AbstractVivienda {
    private char ubicacion;
    private double incremento;

    /*public Casa(char ubicacion, double incremento, double area, double precio, double adicional, double total, double amocoche) {
        super(area, precio, adicional, total, amocoche);
        this.ubicacion = ubicacion;
        this.incremento = incremento;
    }*/

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    @Override
    public void CalcularAdicional(){
        if(getAmocoche()=='S'){
            setAdicional(0.30*getPrecio());
        }
    }
    
    public void CalcularIncremento(){
        super.calcularPrecio();
        switch(ubicacion){
            case 'A':
                incremento = 0.60*getPrecio();
                break;
            case 'J':
                incremento = 0.50*getPrecio();
            case 'P':
                incremento = 0.30*getPrecio();
        }    
    }
    @Override
    public void calcularPrecio(){
        setPrecio(getPrecio()+incremento);
    }
    @Override
    public void imprimir(){
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Esta amoblado" +getAmocoche());
        p.println("ubicacion" +ubicacion);
        p.println("Incremento" +incremento);
        p.println("total" +getTotal());
    }
}
