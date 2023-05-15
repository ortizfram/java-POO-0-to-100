/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        //UPCASTING...
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado emp : empleados) {
            System.out.println(emp.nombreCompleto() + ": $" + emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor= null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision){//DOWNCASTING
                // mismo empleado solo que CASTEADO
                EmpleadoAComision eac =(EmpleadoAComision) e;
                int cant = eac.getCantClientesCaptados();
                if(cant > max){
                    max = cant;
                    elMayor = e;
                }
            }
        }
        return elMayor;
    }
}
