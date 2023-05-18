/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_metodosabstractos_salariopersonal;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoSalarioFijo(45000, "123", "Jaime", "Rod", 2021));
        emp.agregarEmpleado(new EmpleadoAComision(30000, 100, 500, "123", "Pepe", "gomez", 2021));
        emp.agregarEmpleado(new EmpleadoAComision(30000, 200, 100, "123", "Leo", "Torres", 2017));
        emp.agregarEmpleado(new EmpleadoSalarioFijo(50000, "123", "Luis", "Gamez", 2019));
        emp.agregarEmpleado(new EmpleadoSalarioFijo(100000, "123", "Maria", "Perez", 2014));
        
        emp.mostrarSalarios();
        
        System.out.println(emp.empleadoConMasClientes());
        
    }
    
}
