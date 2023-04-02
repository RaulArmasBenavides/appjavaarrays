/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.prueba;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import pe.egcc.app.entity.Concierto;
import pe.egcc.app.entity.Teatro;

/**
 *
 * @author dyarm
 */
public class Espectaculo {
    public static void main(String[] args)throws IOException{
    InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(x);
        PrintWriter p = new PrintWriter(System.out,true); 
        
        p.println("CONCIERTO");
        Concierto c = new Concierto();
        p.println("ingrese la ubicacion; (P)latea, (V)ip, (S)upervip ");
        c.setUbicacion(y.readLine().charAt(0));
        p.println("El concierto es de dia? S/N ");
        c.setDia(y.readLine().charAt(0));
        c.calcularPrecio();
        c.calcularIncremento();
        c.calcularImpuesto();//inclue incremento
        c.calcularDescuento();//inclueye adicional
        c.calcularTotal();//inclueye adicional
        c.imprimir();
        
        p.println("TEATRO");
        Teatro t = new Teatro();
        p.println("ingrese la ubicacion; (D)escampado, (C)errado ");
        t.setLugar(y.readLine().charAt(0));
        p.println("La ubicacion es preferencial? S/N ");
        t.setUbicacion(y.readLine().charAt(0));
        t.calcularPrecio();
        t.calcularIncremento();
        t.calcularImpuesto();//inclue incremento
        t.calcularTotalNeto();//inclueye adicional
        t.imprimir();

    }
}
    
