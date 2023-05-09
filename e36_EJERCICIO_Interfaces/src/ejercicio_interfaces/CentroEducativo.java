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
public class CentroEducativo {

    private ArrayList<Alumno> alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }

    public void agragarAlumno(Alumno a) {
        this.alumnos.add(a);
    }

    public int cantAprobados() {
        int cant = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.aprobo()){
                cant++;
            }
        }
        return cant;
    }
}
