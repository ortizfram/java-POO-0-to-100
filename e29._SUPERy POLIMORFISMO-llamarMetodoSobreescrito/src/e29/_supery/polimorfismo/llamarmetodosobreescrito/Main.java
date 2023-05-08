/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e29._supery.polimorfismo.llamarmetodosobreescrito;

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
        ArrayList<Bicicleta> bicis = new ArrayList<>();

        bicis.add(new Bicicleta("fake", 20, 30));
        bicis.add(new Bicicleta("Ultrabike", 28, 55));
        bicis.add(new BicicletaElectrica("BiciE", 16, 65, 250));
        bicis.add(new BicicletaElectrica("Ecleta", 18, 43, 350));

        Taller t = new Taller();
        // ~~~~~~~~~~
// Solo se brinda servicio a bicis :
//        - (-50) kms recorridos
//        - bicis electricas de hasta 400w(sin importar kms)
        System.out.println("Servicios Posibles: " + t.cantServiciosPosibles(bicis));
    }

}
