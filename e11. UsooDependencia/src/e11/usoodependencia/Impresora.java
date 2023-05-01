/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e11.usoodependencia;

/**
 *
 * @author User
 */
public class Impresora {
    private boolean estaEncendida;
    
    public void encender(){
        estaEncendida = true;
        System.out.println("***Encendiendo impresora...");
    }
    
    public void imprimir(Documento doc){
        if (estaEncendida) {
            System.out.println("Imprimiendo doc: "+ doc.getTitulo());
            System.out.println("***************");
            System.out.println(doc.getCuerpo());
            System.out.println("***************");
        } else {
            System.out.println("***Impresora Apagada!");
        }
    }
}
