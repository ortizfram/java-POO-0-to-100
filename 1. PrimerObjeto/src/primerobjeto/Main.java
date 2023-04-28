package primerobjeto;

import java.util.Scanner;

/**
 *
 * @author ortiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("---objeto vacio: ------------" + "\n");
        Auto a = new Auto();
        System.out.println(a.patente + " | " + a.color + " | " + a.kms+"kms" + " | " +"airCond: "+ a.conAire);
        System.out.println("---cambio estado: ------------" + "\n");

        a.patente = "ABC345";
        a.color = "rojo";
        a.kms = 10000;
        a.conAire = true;
        System.out.println(a.patente + " | " + a.color + " | " + a.kms+"kms" + " | " +"airCond: "+ a.conAire);
        System.out.println("---auto2 :------------" + "\n");

        Auto a2 = new Auto();
        a.patente = "ZZZZZZZ";
        a.color = "violeta";
        a.kms = 0;
        a.conAire = true;
        System.out.println(a.patente + " | " + a.color + " | " + a.kms+"kms" + " | " +"airCond: "+ a.conAire);
    }

}
