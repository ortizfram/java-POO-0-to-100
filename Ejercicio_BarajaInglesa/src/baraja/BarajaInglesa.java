/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

import baraja.cartas.Carta;
import baraja.cartas.CartaConPalo;
import baraja.cartas.CartaFigura;
import baraja.cartas.CartaJoker;
import baraja.cartas.CartaNumeral;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BarajaInglesa {

    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
        System.out.println("Cantidad de cartas: "+cartas.size());
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }

    private void generarCartas() {
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
    }
// ----------------------------------

    private void generarCartasNumerales() {
        /* Del 2-10 (9cartas) para 4 palos 
        36cartas*/
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values(); //enum Palo values list

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {

                this.cartas.add(new CartaNumeral(i, paloActual));
            }
        }

    }

    private void generarCartasFiguras() {
        /*16 cartas*/
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();

        for (int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraActual = letras[i];
                this.cartas.add(new CartaFigura(letraActual, paloActual));
            }
        }
    }

    private void generarCartasJokers() {
        /*2cartas*/
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    }
}
