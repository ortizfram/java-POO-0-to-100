/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_metodosabstractos_salariopersonal;

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
    
    public int cantClientesCaptados(){
        return cantClientesCaptados;
    }     
    
    @Override
    public double getSalario(){
        // ccc * mpc, if < a sm = sm
        double sal = montoPorCliente * cantClientesCaptados;
        if (sal < salarioMinimo) {
            sal = salarioMinimo;
        }
        return sal;
    }
}
