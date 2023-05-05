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
        cargarFabrica(f);

        System.out.println("PRUEBA PUNTO A): \nlistar instrumentos\n===================\n");
        f.listarInstrumentos();

        System.out.println("PRUEBA PUNTO B): \ninstrumentos por tipo\n===================\n");
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }

        System.out.println("PRUEBA PUNTO C): \nBorrar isntrumento\n===================\n");
        Instrumento borrado = f.borrarInstrumento("ZZZ111");
        System.out.println("Se borró: " + borrado);
        f.listarInstrumentos();
         
        System.out.println("PRUEBA PUNTO D): \n% intrumentos por tipo\n===================\n");
        double[] porcs = f.porcInstrumentosPorTipo("Sasdasd");

        for (int i = 0; i < porcs.length; i++) {
            System.out.println(porcs[i]);
        }
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
}
