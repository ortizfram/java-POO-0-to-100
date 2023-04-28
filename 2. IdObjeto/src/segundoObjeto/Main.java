/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoObjeto;

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
        Auto a = new Auto();

        a.patente = "ABC345";
        a.color = "rojo";
        a.kms = 10000;
        a.conAire = true;
        System.out.println(a.patente + " | " + a.color + " | " + a.kms + "kms" + " | " + "airCond: " + a.conAire);

//      igualar variable: cambian estado ambas
        Auto otroAuto;
        otroAuto = a;

//        print ambas
        System.out.println(a);
        System.out.println(otroAuto);

        System.out.println(a.color);
        otroAuto.color = "verde";
        System.out.println(a.color);

//        ***it's same object, just changing state
//------------------------------
//         if null, the object will be null below
        otroAuto = null;
        System.out.println(otroAuto.color);
    }

}
