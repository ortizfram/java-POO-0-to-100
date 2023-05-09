/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_interfaces;

/**
 *
 * @author User
 */
public abstract class Examen implements Aprobable {
// abstract pq no se explica como aprueba
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

}
