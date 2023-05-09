/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
public class Persona implements EnviadorDeMensaje{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("\n");
        System.out.println("## Caminando ...");
        System.out.print("Pasando la voz con este mensaje: '"+mensaje+"'");
    }
    
}
