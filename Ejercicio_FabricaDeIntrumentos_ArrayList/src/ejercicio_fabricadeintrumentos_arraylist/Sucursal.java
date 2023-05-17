/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_fabricadeintrumentos_arraylist;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public Instrumento borrarInstrumento(String ID) {
        System.out.println("---Borrar instrumento");
        //buscar inst x ID
        Instrumento aBorrar = buscarInstrumento(ID);
        // si existe, borrar.
        this.instrumentos.remove(aBorrar);
        return aBorrar;
    }
    
    public double[] porcInstrumentosPorTipo() {
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double porcentajes[] = new double[CANT_INSTRUMENTOS];
        for (Instrumento inst : instrumentos) {
            porcentajes[inst.getTipo().ordinal()]++;
        }
        absolutoAPorcentaje(porcentajes);
        return porcentajes;
    }
    
    private void absolutoAPorcentaje(double[] porcentajes){
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = porcentajes[i] * 100 / instrumentos.size();
        }
    }

    private Instrumento buscarInstrumento(String ID) {
        int i = 0;
        Instrumento insEncontrado = null;
        /* mientras hayan y ID inst actual = ID param*/
        while (i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)) {
            i++;
        }
        /* si para es porque lo encontro, se asigna a Encontrado*/
        if (i < instrumentos.size()) {
            insEncontrado = this.instrumentos.get(i);
        }
        return insEncontrado;
    }

    public void agregarInstrumento(Instrumento ins) {
        this.instrumentos.add(ins);
    }

    public void listarInstrumentos() {
        for (Instrumento inst : instrumentos) {
            System.out.println(inst);
        }
    }

    public ArrayList<Instrumento> intrumentosPorTipo(TipoInstrumento tipo) {
        /* si tipo = pedido por param, copiar y retornar */
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Instrumento inst : instrumentos) {
            if (inst.getTipo() == tipo) {
                instEncontrados.add(inst);
            }
        }

        return instEncontrados;
    }

    public String getNombre() {
        return nombre;
    }

}
