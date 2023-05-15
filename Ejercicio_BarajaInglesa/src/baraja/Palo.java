/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja;

/**
 *
 * @author User
 */
public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO);

    private Color color;

//    instantiate color in Palo constructor
    private Palo(Color co) {
        this.color = co;
    }
}
