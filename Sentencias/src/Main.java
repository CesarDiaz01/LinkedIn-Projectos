public class Main {
    public static void main(String[] args) {

        Caja<String> caja1 = new Caja<>("Hola");

        Integer numero = 5;
        Caja<Integer> caja2 = new Caja<>(numero);

        String miObjeto = "Perro";

        System.out.println("es igual caja1 que miObjeto: "+caja1.perteneceElContenidoALaMismaClase(miObjeto));
        System.out.println("es igual caja1 que miObjeto: "+caja2.perteneceElContenidoALaMismaClase(miObjeto));
    }
}
