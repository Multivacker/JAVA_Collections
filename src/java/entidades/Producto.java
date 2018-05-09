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
public class Producto implements Comparable<Producto>{

    @Override
    public int compareTo(Producto lat) {
        return this.nombreUrl.compareTo(lat.nombreUrl);
    }
    
    @Override
    public String toString() {
        return "\n" + rubro + "\t" + nombreUrl + "\t" + this.getElPropietario() + "\n" ; 
    }
    
    
    public Producto(String nombreUrl, String rubro, Cliente elPropietario) {
        this.setNombreUrl(nombreUrl);
        this.setElPropietario(elPropietario);
        this.setRubro(rubro);
    }
    
    private String rubro;
    private String nombreUrl;
    private Cliente elPropietario;
    

    
    public String getNombreUrl() {
        return nombreUrl;
    }
    public final void setNombreUrl(String nombre) {
        this.nombreUrl = nombre;
    }
    public Cliente getElPropietario() {
        return elPropietario;
    }

    public void setElPropietario(Cliente elPropietario) {
        this.elPropietario = elPropietario;
    }
    
    public String getRubro() {
        return rubro;
    }
    public final void setRubro(String rubro) {
        this.rubro = rubro;
    }


}