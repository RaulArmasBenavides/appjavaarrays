/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.egcc.app.prueba;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import pe.egcc.app.entity.Casa;
import pe.egcc.app.entity.Departamento;
   

/**
 *
 * @author dyarm
 */
public class InmobiliariaTest {
    public static void main(String[] args)throws IOException{
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(x);
        PrintWriter p = new PrintWriter(System.out,true); 
        
        p.println("CASA");
        Casa c = new Casa();
        p.println("ingrese area");
        c.setArea(Double.parseDouble(y.readLine()));
        p.println("Ingresar Unicacion: (A)venida, (J)iron, (P)asaje ");
        c.setUbicacion(y.readLine().charAt(0));
        p.println("esta amoblada?");
        c.setAmocoche(y.readLine().charAt(0));
        c.CalcularIncremento();
        c.CalcularAdicional();
        c.calcularPrecioConIncremento();//inclue incremento
        c.calcularTotal();//inclueye adicional
        c.imprimir();
        
        
        
        
        p.println("DEPARTAMENTO");
        Departamento d = new Departamento();
        p.println("ingrese area");
        d.setArea(Double.parseDouble(y.readLine()));
        p.println("Tiene cochera? S/N ");
        d.setAmocoche(y.readLine().charAt(0));
        p.println("Ingresar piso");
        d.setPiso(y.readLine().charAt(0));
        d.calcularPrecio();
        d.CalcularAdicional();
        d.CalcularDescuento();
        d.calcularTotal();
        d.imprimir();
        }
}
