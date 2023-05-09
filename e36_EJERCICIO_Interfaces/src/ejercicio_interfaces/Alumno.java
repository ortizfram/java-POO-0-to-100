/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_interfaces;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Alumno implements Aprobable {

    private String DNI;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenes;

    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen e) {
        this.examenes.add(e);
    }

    @Override
    public boolean aprobo() {
        int i = 0;
        while (i < this.examenes.size() &&) {
            i++;
        }
        return true;
    }

}

}
