/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja.cartas;

import baraja.Palo;

/**
 *
 * @author User
 */
public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    public Palo getPalo() {
        /* getter de palo porque atributo es private, 
    es para overrride en istancia de clase */
        return palo;
    }

    @Override
    public String getRepresentacion() {
        return " de " + palo;

    }
}
