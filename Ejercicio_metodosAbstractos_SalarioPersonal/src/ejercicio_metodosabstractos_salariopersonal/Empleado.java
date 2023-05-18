/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_metodosabstractos_salariopersonal;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public abstract class Empleado {
    private String DNI;
    private String nombre ;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    
    public int antiguedadEnAnios(){
        int anioActual = LocalDate.now().getYear();
        return  anioActual - anioIngreso;
    }
    
    public String nombreCOmpleto(){
        return this.nombre+ " "+ this.apellido;
    }
    
    public abstract double getSalario();
}
