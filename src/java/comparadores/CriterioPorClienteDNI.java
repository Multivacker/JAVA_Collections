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
public class CriterioPorClienteDNI implements Comparator<Producto>{
    
    @Override
    public int compare(Producto t, Producto t1) {
        return t.getElPropietario()
                .getDni()
                .compareTo(
                        t1.getElPropietario().getDni());
    }
}
