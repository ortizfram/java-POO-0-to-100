/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e6.sobrecarga.de.metodo;

/**
 *
 * @author ortiz
 */
public class Robot {
//ATTRIBUTOS
    private String nombre;
//    ______________________
//CONSTRUCTOR
    
    public Robot(String nombre) {
        setNombre(nombre);
    }
//_____________________________
//    METHODS
    private void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void saludar(String nombrePersona){
        System.out.println("Hola " + nombrePersona+ " ,soy " + nombre);
    }
    
        public void saludar(){
        saludar("extranio");
    }

}
