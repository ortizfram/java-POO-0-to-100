/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoSalarioFijo(45000,"123","Jorge","Rock",2023));
        emp.agregarEmpleado(new EmpleadoSalarioFijo(60000,"123","Pepe","Marti",2021));
        emp.agregarEmpleado(new EmpleadoSalarioFijo(87000,"123","Marta","Ulise",2019));
        emp.agregarEmpleado(new EmpleadoAComision(60000,300,100,"123","Aldi","Lopez",2017));
        emp.agregarEmpleado(new EmpleadoAComision(50000,100,600,"123","Brian","Mayers",2020));
        
        emp.mostrarSalarios();
        System.out.println("empleado con mas Clientes: "+emp.empleadoConMasClientes().nombreCompleto());
    }
    
}
