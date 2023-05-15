/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author User
 */
public class EmpleadoAComision extends Empleado{
    
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(double sm, int ccc, double mpc, String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = sm;
        this.cantClientesCaptados = ccc;
        this.montoPorCliente = mpc;
    }
    public int getCantClientesCaptados(){
        return cantClientesCaptados;
    }
    
    @Override
    public double getSalario(){
        /** 
            Si no excede ventas, dar SalarioMinimo
        */
        double sal = montoPorCliente * cantClientesCaptados;
        if (sal < salarioMinimo){
            sal = salarioMinimo;
        }
        return sal;
    }
    
}
