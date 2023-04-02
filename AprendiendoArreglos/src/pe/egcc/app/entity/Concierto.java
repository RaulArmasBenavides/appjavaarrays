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
public class Concierto extends AbstractEspectaculo {
    
    private double descuento; //calcular
    private char dia; //ingresar

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public char getDia() {
        return dia;
    }

    public void setDia(char dia) {
        this.dia = dia;
    }
    
    @Override
    public void calcularPrecio(){
        setPrecio(70);
    }
    
    public void calcularDescuento(){
        if(dia=='S'){
            descuento=15;
        }
    }
    @Override
    public void calcularIncremento(){
        switch(getUbicacion()){
            case 'P':
                setIncremento(0);
                break;
            case 'V':
                setIncremento(0.2*getPrecio());
                break;
            case 'S':
                setIncremento(0.3*getPrecio());
                break;
            
        }
    }
    
    public void calcularTotal(){
        super.calcularTotalNeto();
        setTotal(getTotal()-descuento);
    }
    @Override
    public void imprimir(){
        super.imprimir();
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("es de dia" +dia);
        p.println("descuento" +descuento);
        p.println("total" +getTotal());
        
    }
}
