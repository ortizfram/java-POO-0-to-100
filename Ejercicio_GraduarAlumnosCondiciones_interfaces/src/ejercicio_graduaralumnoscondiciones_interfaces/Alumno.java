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
public class Alumno implements Aprobable{
    /** @Atributos */
    private String DNI;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenes;

    /** @Constructor */
    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }

    /** @Methods */
    public void agregarExamen(Examen e){
        this.examenes.add(e);
    }

    @Override
    public boolean aprobo() {
        /** se ejecuta mientas haya examenes y examen esté aprobado*/
        int i =0;
        while(i< this.examenes.size() && this.examenes.get(i).aprobo()){
            i++;
        }
        return i == this.examenes.size();
    }
    
    
    
}
