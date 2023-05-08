/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e29._supery.polimorfismo.llamarmetodosobreescrito;

/**
 *
 * @author User
 */
public class Bicicleta {
    private final int CANT_KMS_MAX = 50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }
    
    public boolean cumpleRequisitos(){
        return this.cantKms < CANT_KMS_MAX;
    }
    
}
