/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_graduaralumnoscondiciones_interfaces;

/**
 *
 * @author ortiz
 */
public abstract class Examen implements Aprobable{
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    
}
