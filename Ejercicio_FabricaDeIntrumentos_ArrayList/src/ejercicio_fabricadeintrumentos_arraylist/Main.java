/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_fabricadeintrumentos_arraylist;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        // listar
        f.listarInstumentos();
        
        // pot tipo
        System.out.println("/////");
        ArrayList<Instrumento> lista = f.intrumentosPorTipo(TipoInstrumento.VIENTO);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
        
        // borrar
        System.out.println("///");
        f.borrarInstrumento("7");
        
        // % inst por tipo
        System.out.println("///");
        double[] porcs = f.porcInstrumentosPorTipo("Instrumentos Jaime");
        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
    }

    private static void cargarFabrica(Fabrica f) {
        /**
         * @instanciar crear sucursales, agragar isntrumentos, a gragar
         * sucursales a fabricas
         */
        Sucursal s1 = new Sucursal("Instrumentos Jaime");
        Sucursal s2 = new Sucursal("Instrumentos Pepe");

        s1.agregarInstrumento(new Instrumento("1", 40000, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("3", 70000, TipoInstrumento.PERCUSION));
        s1.agregarInstrumento(new Instrumento("4", 40000, TipoInstrumento.CUERDA));

        s2.agregarInstrumento(new Instrumento("7", 10000, TipoInstrumento.VIENTO));
        s2.agregarInstrumento(new Instrumento("8", 20020, TipoInstrumento.PERCUSION));
        s2.agregarInstrumento(new Instrumento("9", 31000, TipoInstrumento.PERCUSION));

        f.agregarSucursal(s2);
        f.agregarSucursal(s1);
    }

}
