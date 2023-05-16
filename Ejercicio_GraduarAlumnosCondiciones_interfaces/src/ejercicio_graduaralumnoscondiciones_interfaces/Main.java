/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_graduaralumnoscondiciones_interfaces;

/**
 *
 * @author ortiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();
        
        Alumno pepe = new Alumno("123", "Fulano", "pepe");
        Alumno maria = new Alumno("124", "Mengano", "maria");
        Alumno luis = new Alumno("125", "Sultano", "luis");
        
        // Nivel satisfaccion Min Suficiente
        pepe.agregarExamen(new ExamenEscrito(80,7,"00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        // nota min 6
        maria.agregarExamen(new ExamenEscrito(60,4,"00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(80,8,"00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));
        
        // si se pasa de 90min se desaprueba
        luis.agregarExamen(new ExamenEscrito(100,9,"00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        c.agregarAlumno(luis);
        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        
        System.out.println("Cantidad aprobados: "+ c.cantAprobados());
    }
    
}
