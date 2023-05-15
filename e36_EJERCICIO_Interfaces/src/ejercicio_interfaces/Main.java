/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_interfaces;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123", "Fulano", "PEPE");
        Alumno maria = new Alumno("124", "Mengano", "Maria");

        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));

        maria.agregarExamen(new ExamenEscrito(60, 4, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        
        c.agragarAlumno(pepe);
        c.agragarAlumno(maria);
        
        System.out.println("Cdad de aprobados: "+ c.cantAprobados());
    }

}
