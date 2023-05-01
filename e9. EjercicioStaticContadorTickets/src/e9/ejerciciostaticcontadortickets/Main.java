/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e9.ejerciciostaticcontadortickets;

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
        Ticket t1 = new Ticket("2023/05/01", "43545322");
        Ticket t2 = new Ticket("2023/05/01", "43545455");
        Ticket t3 = new Ticket("2023/05/01", "43545666");
        Ticket t4 = new Ticket("2023/05/01", "42345388");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}
