/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e18.enums;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empresa e = new Empresa();
        
        e.agregarPersona(new Persona("Pepe","Fulano", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Pepe","Fulano", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Pepe","Fulano", NivelEstudio.SIN_ESTUDIOS));
        e.agregarPersona(new Persona("Pepe","Fulano", NivelEstudio.TERCIARIO));
        e.agregarPersona(new Persona("Pepe","Fulano", NivelEstudio.UNIVERSITARIO));
        
        e.mostrarPorNivel(NivelEstudio.SECUNDARIO);
    }
    
}
