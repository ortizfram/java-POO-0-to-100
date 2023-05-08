/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ortiz
 */
public class Vehiculo {

    public String patente;
    public String marca;
    public String modelo;

    public Vehiculo(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null) {
            this.marca = nuevaMarca;
        }
    }

    public void encender() {
        System.out.println("# Encendiendo...");
    }
    
    public void acelerar() {
        System.out.println("# Acelerando...");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

}
