/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ortiz
 */
public class Moto extends Vehiculo{
    private int anchoDeManubrio;

    public Moto(int anchoDeManubrio, String patente, String marca, String modelo) {
        super(patente, marca, modelo);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    public void hacverWheelie(){
        System.out.println("# HACIENDO WHEELIE...");
    }
}
