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
public class Departamento extends AbstractVivienda {
    private int piso;
    private double descuento;

    /*public Departamento(int piso, double descuento, double area, double precio, double adicional, double total, double amocoche) {
        super(area, precio, adicional, total, amocoche);
        this.piso = piso;
        this.descuento = descuento;
    }*/
    
    @Override
    public void CalcularAdicional(){
        if(getAmocoche()=='S'){
            setAdicional(0.35);
        }
        
    }
    public void CalcularDescuento(){
        if(piso>3)
            descuento=0.03*getPrecio();
    }
    @Override
    public void calcularTotal(){
        super.calcularTotal();
        setTotal(getTotal()-descuento);
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public void imprimir(){
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Esta amoblado" +getAmocoche());
        p.println("Piso" +piso);
        p.println("Descuento" +descuento);
        p.println("total" +getTotal());
    }
    
}
