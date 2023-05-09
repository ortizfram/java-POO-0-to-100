/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    public void volarRapido() {
        System.out.println("## Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.print("Lanzando papelito que dice: '" + mensaje+"'");
        System.out.println(" ");
    }
}
