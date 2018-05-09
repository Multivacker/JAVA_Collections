/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import comparadores.CriterioPorClienteDNI;
import comparadores.CriterioPorApellidoNombre;
import entidades.Cliente;
import entidades.Producto;
import java.util.*;

/**
 * <pre>
 * Referencia, comienzo encarando la programacion
 * del ejercicio, con TDD  como concepto basico.
 * https://en.wikipedia.org/wiki/Test-driven_development
 * https://en.wikipedia.org/wiki/Extreme_programming
 * </pre>
 * 
 */

/**
 *
 * @author Nahuel E Correa
 * 
 */
public class TestOrdenandoPorCriterio {

    public static void main(String[] args) {
        
        System.out.println("[..] Por Criterio");
        System.out.println("");

        System.out.println("1.a --------------");
        System.out.println("Ingresa Cliente, imprime lista completa:");
        
        Cliente may = new Cliente("12134156", "Mayra", "Saracho");
        Cliente mar = new Cliente("23246267","Maria","Martinez");
        Cliente car = new Cliente("34356378","Carla","Rodriguez");
        Cliente ros = new Cliente("45467489","Rosa","Torres");
        Cliente deb = new Cliente("56579590", "Debora", "Saracho");
        Cliente cam = new Cliente("67689601", "Camila", "Sanguinetti");
        Cliente sil = new Cliente("78790712", "Silvia", "Vallecillos");
        Cliente nes = new Cliente("89801823", "Nestor", "Ricardi");
        Cliente oct = new Cliente("90912934", "Octavio", "Saracho");
        Cliente let = new Cliente("10912934", "Leticia", "Benedetti");
        Cliente mir = new Cliente("20912934", "Mirta", "Benedetti");
        Cliente nah = new Cliente("30912934", "Nahuel", "Benedetti");
        Cliente osc = new Cliente("40912934", "Oscar", "Benedetti");
        Cliente ped = new Cliente("50912934", "Pedro", "Benedetti");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("1.b --------------");
        System.out.println("Ingresa Sitio, imprime lista completa:");
        
        Producto sitioMay = new Producto("tantiauguri.com.ar", "Diseño textil", may);
        Producto sitioMarI = new Producto("lansescapeph.com.ar", "Fotografia", mar);
        Producto sitioMarII = new Producto("piescontentos.com", "Pedicuria", mar);
        Producto sitioCam = new Producto("sanguinettibio.com", "Página personal", cam);
        Producto sitioCar = new Producto("farmapueblo.com.ar", "Farmacia", car);
        Producto sitioDeb = new Producto("wixtemplates.com", "Diseño web", deb);
        Producto sitioRos = new Producto("voleyahora.com.io", "Deportes", ros);
        Producto sitioSil = new Producto("graficacyma1616.com", "Gráfica offset", sil);
        Producto sitioNes = new Producto("ricardiimp.com.it", "Editorial", nes);
        Producto sitioCamI = new Producto("intercambiostorrent.org", "Intercambios", cam);
        Producto sitioCamII = new Producto("taringacolectiva.net", "Red social", cam);
        Producto sitioCamIII = new Producto("elferroviario.com.ar", "Transporte", cam);
        Producto sitioOct = new Producto("lineacaba.com.ar", "Marca textil", oct);
        Producto sitioLet = new Producto("cidcampeador.com.ar", "Histórica", let);
        Producto sitioMir = new Producto("elenadetroya.com.ar", "Histórica", mir);
        Producto sitioNah = new Producto("greciatoday.com.ar", "Histórica", nah);
        Producto sitioOsc = new Producto("nefertiti.com.ar", "Histórica", osc);
        Producto sitioPed = new Producto("losfenicios.com.ar", "Histórica", ped);
        
        System.out.println("");
        System.out.println("");
        

        System.out.println("2. --------------");
        System.out.println("Enumera la cantidad de productos y los muestra como una lista:");
        
            ArrayList<Producto> listaProductos = new ArrayList();
        
            listaProductos.add(sitioMay);
            listaProductos.add(sitioMarI);
            listaProductos.add(sitioMarII);
            listaProductos.add(sitioCam);
            listaProductos.add(sitioCar);
            listaProductos.add(sitioDeb);
            listaProductos.add(sitioRos);
            listaProductos.add(sitioSil);
            listaProductos.add(sitioNes);
            listaProductos.add(sitioCamI);
            listaProductos.add(sitioCamII);
            listaProductos.add(sitioCamIII);
            listaProductos.add(sitioOct);
            listaProductos.add(sitioLet);
            listaProductos.add(sitioMir);
            listaProductos.add(sitioNah);
            listaProductos.add(sitioOsc);
            listaProductos.add(sitioPed);
        
        System.out.println("Cantidad en Lista Productos: "
                + listaProductos.size());
        
        
        System.out.println("3. --------------");
        TreeSet<Producto> arbolProductos = new TreeSet();
        arbolProductos.addAll(listaProductos);
        System.out.println("Cantidad en Arbol : "
                + arbolProductos.size());
        
        
        System.out.println("4. --------------");
        //Set uno = new Set(); // no puedo instanciar interfaces
        Set uno = new TreeSet(); // necesito clases concretas
        
        
        System.out.println("5. --------------");
        System.out.println("Lista SIN Ordenar:"
                + listaProductos);
        Collections.sort(listaProductos);
        //Collections.sort(arbolProductos); // no puedo ordenar sino tengo indice del orden
        System.out.println("Lista Ordenada Naturalment:"
                + listaProductos);
        Collections.reverse(listaProductos);
        System.out.println("Lista Ordenada Inversamente:"
                + listaProductos);
        
        
        System.out.println("6. --------------");
        // por DNI del cliente
        CriterioPorClienteDNI criterioDNI = new CriterioPorClienteDNI();
        Collections.sort(listaProductos, criterioDNI);
        System.out.println("Orden por DNI:"
                + listaProductos);
        Collections.sort(listaProductos, 
                Collections.reverseOrder(criterioDNI) );
        System.out.println("Inverso por DNI:"
                + listaProductos);
        
        System.out.println("");
        System.out.println("");
        System.out.println("7. -----------------------------------------------------------------------------------------------");
        // por apellido, desempata por nombre
        CriterioPorApellidoNombre criterioApellidoNombre = new CriterioPorApellidoNombre();
        Collections.sort(listaProductos, criterioApellidoNombre);
        System.out.printf("Orden por Apellido y Nombre:" + "\n" + "\n" + "RUBRO/ESP" + "\t" + "DIRECCION WEB/URL       " + "\t" + "DNI/ID   " + "\t"
                + "APELLIDO        " + "\t" + "NOMBRE" + "\t" + "\n" 
                + listaProductos);
        
        
        
        System.out.println("8. --------------");

        
        
        System.out.println("[OK] Por Criterio");
    }
}