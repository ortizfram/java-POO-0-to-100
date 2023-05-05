/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e21.ejerciciopooconarraylist;

import java.util.ArrayList;

public class Sucursal {

    private ArrayList<Instrumento> instrumentosColl;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentosColl = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarInstrumentos(Instrumento ins) {
        this.instrumentosColl.add(ins);
    }
    

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentosColl) {
            System.out.println(instrumento);
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Instrumento instrumento : instrumentosColl) {
            if (instrumento.getTipo() == tipo) {
                instEncontrados.add(instrumento);
            }
        }
        return instEncontrados;
    }
    
//    public Instrumento borrarInstrumento(String ID){
//        
//    }
}
