import java.util.Scanner;
public class SentenciaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numeroUsuario;
        do{
            System.out.println("introduzca un numero y le mostaremos la raiz cuadrada para salir, introduzca el 0");
            numeroUsuario= scanner.nextDouble();

            if(numeroUsuario==0){
                System.out.println("Hasta la vista");
            }else{
                System.out.println("la raiz cuadrada de "+numeroUsuario+" es: "+ Math.sqrt(numeroUsuario));
            }

        } while (numeroUsuario !=0);
    }
}
