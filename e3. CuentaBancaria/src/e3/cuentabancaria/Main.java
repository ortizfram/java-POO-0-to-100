package e3.cuentabancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria();

//        loop menu
        while (opcion != 5) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Mostrar estado de cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Extraer");
            System.out.println("5. Salir");
//       menu opcion
            opcion = scanner.nextInt();

//            SWITCH
            switch (opcion) {
                case 1:
                    cuenta.mostrarEstado();
                    break;
                case 2:
                    cuenta.getSaldo();
                    break;
                case 3:
                    double montoDeposito = cuenta.introducirMonto();
                    cuenta.depositar(montoDeposito);
                    break;
                case 4:
                    double montoExtraccion = cuenta.introducirMonto();
                    cuenta.extraer(montoExtraccion);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione otra opcion.");
                    break;
            }
        }
    }

}
