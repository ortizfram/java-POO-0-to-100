/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e19.enums;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
//        return space used in memory
        System.out.println(NivelEstudio.PRIMARIO.ordinal());
//        return enum class a STR
        System.out.println(NivelEstudio.PRIMARIO.toString());
        System.out.println("***************");

//      estatic values retornar as array
        NivelEstudio[] niveles = NivelEstudio.values();
        for (int i = 0; i < niveles.length; i++) {
            System.out.println((i + 1) + ") " + niveles[i]);
        }

//        ---------------------------
        System.out.println("Ingrese opcion:...\n-------------");
        // input
        Scanner scan = new Scanner(System.in);
        // read
        int num = scan.nextInt();
        System.out.println("Usted eligio " + niveles[num - 1]);
        scan.close();
    }

}
