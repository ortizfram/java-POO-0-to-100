/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PartidoDelBuenCodigo {
    private ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }
    
    public void agragarMensajeros(EnviadorDeMensaje mensajero){
        this.mensajeros.add(mensajero);
    }
    
    public void hacerCampania(){
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el Partido Del Buen Codigo");
        }
    }
}
