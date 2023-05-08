/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e29._supery.polimorfismo.llamarmetodosobreescrito;

/**
 *
 * @author User
 */
public class BicicletaElectrica extends Bicicleta {

    private final int CANT_POT_MAX = 400;
    private int potencia;

    public BicicletaElectrica(String marca, int rodado, int cantKms, int potencia) {
        super(marca, rodado, cantKms);
        this.potencia = potencia;
    }

    @Override
    public boolean cumpleRequisitos() {
        // se hereda de Bicicleta los kms max SUPER
        return this.potencia < CANT_POT_MAX && super.cumpleRequisitos();
    }

}
