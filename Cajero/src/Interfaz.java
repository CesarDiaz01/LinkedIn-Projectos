import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Por favor ingrese su numero de identificacion");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor ingrese su contraseña");
        String contraseña = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador,contraseña);

        int opcionSeleccionada;
        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("Escriba 1 para consultar su saldo.");
            System.out.println("Escriba 2 para ingresar dinero.");
            System.out.println("Escriba 3 para sacar dinero.");
            System.out.println("Escriba 4 para consultar sus últimos movimientos");

            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                default:
                    cajero.salir();
                    break;
            }
        }
        while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);
        }
    }

