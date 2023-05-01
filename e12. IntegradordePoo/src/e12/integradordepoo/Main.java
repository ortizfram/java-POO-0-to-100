/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e12.integradordepoo;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Postnet postnet = new Postnet();
        Persona p = new Persona("40535321","Pepe","Argento","2613006666", "pepefake@kete.com");
        TarjetadeCredito t = new TarjetadeCredito("FakeBank","152678391238712", 15000, p, EntidadFinanciera.BIRZA);
        
        
        System.out.println("Tarjeta antes del pago");
        System.out.println(t);
        
        System.out.println("Tarjeta tras pago");
        Ticket ticketGenerado = postnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
    
}
