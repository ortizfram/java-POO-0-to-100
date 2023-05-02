/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e15.promediosumatoriacoleccionobjetos;

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
        Concesionaria c = new Concesionaria("FakeCar");

        c.agregarAuto(new Auto("123", "Rojo", 1000));
        c.agregarAuto(new Auto("563", "verde", 2000));
        c.agregarAuto(new Auto("333", "Azul", 3000));

        System.out.println("Kms totales recorridos " + c.sumatoriaKmsRecorridos());
        System.out.println("Cantidad de autos " + c.cantAutos());
        System.out.println("Kms promedio recorridos " + c.promedioKmsRecorridos());
    }
}
