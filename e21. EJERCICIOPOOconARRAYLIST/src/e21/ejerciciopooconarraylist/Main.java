/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e21.ejerciciopooconarraylist;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        cargarFabrica(f); //static in main
        //-------------

        f.listarInstrumentos();
        System.out.println("\nLista por Tipo\n-------------");
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("sucursalA");
        Sucursal s2 = new Sucursal("sucursalB");

        s1.agregarInstrumentos(new Instrumento("AC4", 66577, TipoInstrumento.PERCUSION));
        s1.agregarInstrumentos(new Instrumento("567", 25000, TipoInstrumento.VIENTO));
        s1.agregarInstrumentos(new Instrumento("Ab4", 13999, TipoInstrumento.PERCUSION));

        s2.agregarInstrumentos(new Instrumento("B777", 666, TipoInstrumento.CUERDA));
        s2.agregarInstrumentos(new Instrumento("123A", 50700, TipoInstrumento.PERCUSION));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }

}
