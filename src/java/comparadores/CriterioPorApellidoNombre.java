/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import entidades.*;
import java.util.Comparator;

/**
 *
 * @author Nahuel E Correa
 * 
 */
public class CriterioPorApellidoNombre implements Comparator<Producto>{
    
    @Override
    public int compare(Producto t, Producto t1) {
        //return t.getElPropietario().getApellido().compareTo(t1.getElPropietario().getApellido());
        
        if(t.getElPropietario().getApellido() == t1.getElPropietario().getApellido()){
            
            return t.getElPropietario().getNombre().compareTo(t1.getElPropietario().getNombre());
        
        }else{
            
            return t.getElPropietario().getApellido().compareTo(t1.getElPropietario().getApellido());
            
        }
                
    }
}

