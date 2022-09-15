import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor introducsca una cantidad en euros y el programa le devolvera la conversion en Dolares EE.UU.");

        double euros = scanner.nextDouble();
        double dolares = 1.09* euros;

        System.out.println(euros+" equivalen a US $"+dolares);
    }
}
