/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e12.integradordepoo;

/**
 *
 * @author User
 */
public class Ticket {
    
    private String nombreApellido;
    private double montTotal;
    private double montoPorCuota;

    public Ticket(String nombreApellido, double montTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montTotal = montTotal;
        this.montoPorCuota = montoPorCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montTotal=" + montTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
    
    
}
