/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_interfaces;

/**
 *
 * @author User
 */
public class ExamenEscrito extends Examen {

    private static final int MIN_NOTA = 0;
    private static final int MAX_NOTA = 10;
    private static final int NOTA_APORB = 6;
    private static final int MIN_DURACION = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        return nota >= NOTA_APORB && duracion <= MIN_DURACION;
    }

}
