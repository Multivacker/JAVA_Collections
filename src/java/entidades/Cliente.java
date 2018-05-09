/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Nahuel E Correa
 * 
 */
public class Cliente {

    @Override
    public String toString() {
        return "\t" + this.dni + "\t" + this.apellido + ", " + "\t" + "\t" +this.nombre; 
    }
    
    // Constuctor
    public Cliente(String dni, String nombre, String apellido){
        this.setApellido(apellido);
        this.setDni(dni);
        this.setNombre(nombre);
        //this.nombre = nombre;
    }
    // atritubos
    private String nombre;
    private String apellido;
    private String dni;
    
    // metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}