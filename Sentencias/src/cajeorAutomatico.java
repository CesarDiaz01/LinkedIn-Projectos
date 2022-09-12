import java.util.Scanner;

public class cajeorAutomatico {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("ELIJA UNA DE LAS SIGUIENTES OPCIONES");
            System.out.println("   Escriba (1) para consultar su saldo");
            System.out.println("   Escriba (2) para ingresar dinero");
            System.out.println("   Escriba (3) para sacar dinero");
            System.out.println("   Escriba (4) para consultar sus ultimos movimientos");
            System.out.println("Para salir presione cualquier otro numero");

            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Eligio la opcion 1, consultar su saldo");
                    break;
                case 2:
                    System.out.println("Eligio la opcion 2, ingresar dinero");
                    break;
                case 3:
                    System.out.println("Eligio la opcion 3, sacar dinero");
                    break;
                case 4:
                    System.out.println("Eligio la opcion 4, consultar ultimos movimientos");
                    break;
                default:
                    System.out.println("Gracias por usas nuetro servicio");
                    break;
            }
        } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
    }
}
