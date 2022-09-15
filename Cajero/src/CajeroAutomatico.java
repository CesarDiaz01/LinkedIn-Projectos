import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String Identificador, String contraseña) {
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 100000);
        cuentaBancariaActual = new CuentaBancaria("Cesar Diaz", cantidadAleatoria);
    }

    void mostrarSaldo() {
        System.out.println("Su saldo es: " + cuentaBancariaActual.obtenerSaldo());
    }
    void ingresarDinero(){
        System.out.println("¿Cuanto dinero desea ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    void consultarUltimosMovimientos(){
        GeneradorAleatoriodeMovimientos generadorAleatoriosDeMovimientos = new GeneradorAleatoriodeMovimientos();
        System.out.println("¿Cuantos movimientos desea consultar?");
        Scanner scanner=new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatoriosDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }
    void mostrarMovimientos(ArrayList<String> movimientos){
        for(String movimiento : movimientos){
            System.out.println(movimiento);
        }
    }

    void sacarDinero() {
        System.out.println("¿Cuanto dinero desea sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    void salir() {
        System.out.println("Muchas Gracias Por Utilizar Nuestros Servicios!!");
    }


}
