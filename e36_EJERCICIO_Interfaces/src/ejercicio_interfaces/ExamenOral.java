/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_interfaces;

/**
 *
 * @author User
 */
public class ExamenOral extends Examen {

    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion, String fecha) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean aprobo() {
        return nivelSatisfaccion.ordinal() >= NivelSatisfaccion.SUFICIENTE.ordinal();
    }

}
