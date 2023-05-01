/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e7.tostring;

/**
 *
 * @author ortiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona("franco","fulano",24,false);
        Persona per2 = new Persona("Gaby","zozo",50,true);
        Persona per3 = new Persona("Jorgito","Caotrina",21,false);
    
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        
        String x = per1.toString();
        System.out.println("\n"+x);
    }
    
}
