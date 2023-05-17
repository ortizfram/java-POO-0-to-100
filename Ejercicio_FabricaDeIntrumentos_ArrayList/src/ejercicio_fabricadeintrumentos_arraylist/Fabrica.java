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
public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal suc) {
        this.sucursales.add(suc);
    }

    public void listarInstumentos() {
        System.out.println("----Listar instrumentos de Fabrica");
        for (Sucursal sucursal : sucursales) {
            System.out.println("**Sucursal: " + sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }

    public ArrayList<Instrumento> intrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal suc : sucursales) {
            /* para tener 1 sola lista por todos inst por sucursal*/
            instEncontrados.addAll(suc.intrumentosPorTipo(tipo));
        }
        System.out.println("----Buscar instrumentos por tipo: " + tipo);
        return instEncontrados;
    }

    public double[] porcInstrumentosPorTipo(String nombreSuc) {
        double[] porcentajes = null;
        Sucursal sucEncontrada = buscarSucursal(nombreSuc);
        if (sucEncontrada != null) {
            porcentajes = sucEncontrada.porcInstrumentosPorTipo();
        }
        System.out.println("----% intrumentos por tipo");
        return porcentajes;
    }

    private Sucursal buscarSucursal(String nombreSuc) {
        int i = 0;
        Sucursal sucEncontrada = null;
        /* mientras hayan y ID inst actual = ID param*/
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc)) {
            i++;
        }
        /* si para es porque lo encontro, se asigna a Encontrado*/
        if (i < sucursales.size()) {
            sucEncontrada = this.sucursales.get(i);
        }
        return sucEncontrada;
    }

    public Instrumento borrarInstrumento(String ID) {
        /* Si sucursal no tiene inst: NULL*/
        Instrumento borrado = null;
        /* porque es busqueda de ID */
        int i = 0;
        /* mientras hayan y no este borrado */
        while (i < sucursales.size() && borrado == null) {
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        System.out.println("ID borrado: " + ID);
        return borrado;
    }

}
