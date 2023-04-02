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
public class Teatro extends AbstractEspectaculo {
    
    private char lugar;

    public char getLugar() {
        return lugar;
    }

    public void setLugar(char lugar) {
        this.lugar = lugar;
    }
    
    @Override
    public void calcularPrecio(){
        switch(lugar){
            case 'D':
                setPrecio(36);
                break;
            case 'C':
                setPrecio(42);
                break;
        }
            
    }
    @Override
    public void calcularIncremento(){
        if(getUbicacion()=='S'){
            setIncremento(0.07*getPrecio());
        }
    }
     @Override
    public void imprimir(){
        super.imprimir();
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("lugar" +lugar);
        p.println("total" +getTotal());
        
    }
        
    
}
