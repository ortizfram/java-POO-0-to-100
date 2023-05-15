/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraja.cartas;

/**
 *
 * @author User
 */
public abstract class Carta {

    private boolean tapada;

    public Carta() {
        // tapada: false as default
        this.tapada = true;
    }

    public boolean isTapada() {
        return tapada;
    }
    
    public void darVuelta(){
        tapada = !tapada;
    }
    public void mostrar(){
        if (tapada){
            System.out.println("******carta tapada *******");
        } else{
            System.out.println(getRepresentacion());
        }
    }
    public String getRepresentacion(){
        return "Carta Generica";
    }
}
