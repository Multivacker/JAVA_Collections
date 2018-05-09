/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import entidades.Cliente;

/**
 *
 * @author Nahuel E Correa
 */
public class TestCliente {
    
    public static void main(String[] args) {
        
        System.out.println("[..] test Cliente");
        
        Cliente may = new Cliente ("12134156", "Mayra", "Saracho");
        Cliente mar = new Cliente("23246267","Maria","Martinez");
        Cliente car = new Cliente("34356378","Carla","Rojas");
        Cliente ros = new Cliente("45467489","Rosa","Torres");
        Cliente deb = new Cliente("56579590", "Debora", "Saracho");
        
       //Cliente epa = new Cliente("","Cabron","Rosales");
        

        System.out.println("[OK] test Cliente");
    }
}
