/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e8.pkgstatic;

/**
 *
 * @author ortiz
 */
public class Auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double dcto;

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dcto = 10;
    }
    
    public double precioPromocional(){
        System.out.println("---Precio con descuento:"+Auto.dcto + "% ---------");
        return this.precio - this.precio * Auto.dcto / 100;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + '}';
    }

}
