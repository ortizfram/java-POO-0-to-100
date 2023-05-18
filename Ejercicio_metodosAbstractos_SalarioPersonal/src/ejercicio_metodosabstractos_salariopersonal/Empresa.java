/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_metodosabstractos_salariopersonal;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){ //UPCASTING
        this.empleados.add(e);
    }
    
    
    public void mostrarSalarios(){
        /* nombre + salario */
        for (Empleado emp : empleados) {
            System.out.println(emp.nombreCOmpleto()+" : $"+emp.getSalario());
        }
    }
    public Empleado empleadoConMasClientes(){
        int max = -1;
        Empleado elMayor = null;
        for (Empleado emp : empleados) {
            if(emp instanceof EmpleadoAComision){
                EmpleadoAComision eac = (EmpleadoAComision)emp; //DOWCASTING
                int cant = eac.cantClientesCaptados();
                if (cant > max){
                    max=cant;
                    elMayor=emp;
                }
            }
        }
        return elMayor;
    }
}
