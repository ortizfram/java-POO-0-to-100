/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e9.ejerciciostaticcontadortickets;

/**
 *
 * @author User
 */
public class Ticket {
    private static int contador = 100;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        contador++;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIPersona=" + DNIPersona + '}';
    }
    
    
}
