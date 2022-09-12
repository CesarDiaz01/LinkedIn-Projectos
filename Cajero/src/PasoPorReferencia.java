public class PasoPorReferencia {
    public static void main(String[] args) {
        int var1= 23;
        int var2= var1;
        System.out.println(var1);
        System.out.println(var2);
        var2 = 78;
        System.out.println(var1);
        System.out.println(var2);
    }
}
