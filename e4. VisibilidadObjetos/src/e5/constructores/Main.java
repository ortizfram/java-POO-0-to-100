/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e4.visibilidadObjetos;

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
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
//        cb.alias = "|@#$";
        cb.setAlias("miNUevoAlias");// para establer attributo privado

        cb.mostrarDatos();
        String a = cb.getAlias();
        System.out.println(a);
    }

}
