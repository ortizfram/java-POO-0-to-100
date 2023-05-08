/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e29._supery.polimorfismo.llamarmetodosobreescrito;

import java.util.ArrayList;

/**
 *
 * @author User
 */
// ~~~~~~~~~~
// Solo se brinda servicio a bicis :
//        - (-50) kms recorridos
//        - bicis electricas de hasta400w(sin importar kms)
public class Taller {

    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int contador = 0;
        for (Bicicleta bici : bicis) {
            if (bici.cumpleRequisitos()) {
                contador++;
            }
        }
        return contador;
    }
}
