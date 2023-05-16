/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_graduaralumnoscondiciones_interfaces;

import java.util.ArrayList;

/**
 *
 * @author ortiz
 */
public class CentroEducativo {
    /** @Attributs */
    private ArrayList<Alumno> alumnos;
    
    /** @Constructor */
    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }
    
    /** @Methods */
    public void agregarAlumno(Alumno a){
        this.alumnos.add(a);
    }
    
    public int cantAprobados(){
        int cant = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.aprobo()){
                cant++;
            }
        }
        return cant;
    }
}
