/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e11.usoodependencia;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc1 = new Documento("Pruba","Este es un\n text to prueba");
        Impresora imp = new Impresora();
        
        imp.imprimir(doc1);
        
        imp.encender();
        imp.imprimir(doc1);
    }
    
}
