/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje{
    public void llamar(){
        System.out.println("## Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.print("Conectando con la API de whatsapp: \n'"+mensaje+"'");
    }
}
