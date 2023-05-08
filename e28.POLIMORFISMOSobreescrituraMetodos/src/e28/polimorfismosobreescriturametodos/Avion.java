/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e28.polimorfismosobreescriturametodos;

/**
 *
 * @author User
 */
public class Avion extends Vehiculo {

    public void calefaccionarCarburador() {
        System.out.println("## Carburador listo");
    }

    public void regularMezclaCombustible() {
        System.out.println("## Mezcla regulada");
    }

    public void inyectarCombustible() {
        System.out.println("## Combustible inyectado");
    }

    public void masPasos() {
        System.out.println("## Muchos mas pasos...");
    }

    @Override
    public void encender() {
        calefaccionarCarburador();
        regularMezclaCombustible();
        inyectarCombustible();
        masPasos();
    }
}
