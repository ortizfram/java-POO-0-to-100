/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();

//        mensajeros
        p.agragarMensajeros(new PalomaMensajera());
        p.agragarMensajeros(new TelefonoMovil());
        p.agragarMensajeros(new Persona());

//      print
        p.hacerCampania();
    }

}
