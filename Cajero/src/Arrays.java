import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0]="Lunes";
        diasDeLaSemana[1]="Martes";
        diasDeLaSemana[2]="Miercoles";
        diasDeLaSemana[3]="Jueves";
        diasDeLaSemana[4]="Viernes";
        diasDeLaSemana[5]="Sabado";
        diasDeLaSemana[6]="Domingo";

        System.out.println("el primer dia de la semana es: "+diasDeLaSemana[0]);

        int numeros[]={8,9,85,-6};
        int minimo, maximo;
        minimo = maximo = numeros[0];
        for (int i = 0 ; i <= numeros.length - 1; i++){
            if(numeros[i]>maximo) maximo = numeros[i];
            if(numeros[i]<minimo) minimo = numeros[i];
        }


        System.out.println("El valor mas pequeño es: "+minimo+" el valor mas grande es: "+maximo );

    for (int entero:numeros){
        System.out.println("en esta interacion entero tiene le valor de: "+entero);
        if (entero > maximo) maximo = entero;
        if (entero < minimo) minimo = entero;

        System.out.println("El valor mas pequeño es: "+minimo+" el valor mas grande es: "+maximo );

    }
    }
}
