/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ortiz
 */
public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String patente, String marca, String modelo) {
        super(patente, marca, modelo);
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        System.out.println("# Prendiendo Aire...");
    }
}
