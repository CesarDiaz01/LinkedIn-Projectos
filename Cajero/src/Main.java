public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.titular="Juan Martinez";
        cuentaDeJuan.tipoDeCuenta="Nomina";
        cuentaDeJuan.saldo=1_000;

        System.out.println("Juan decide sacar 500 de su saldo");
        cuentaDeJuan.sacarDinero(500);
        System.out.println("El saldo actual de Juan es: $"+cuentaDeJuan.saldo);

        System.out.println("Juan decide ingresar $1000 a su cuenta");
        cuentaDeJuan.ingresarDinero(1000);
        System.out.println("El saldo actual de Juan es: $"+cuentaDeJuan.saldo);

        System.out.println("Juan, quiere cambiar su tipo de cuenta a ahorros");
        cuentaDeJuan.cambiarTipoDeCuenta("Ahorros");
        System.out.println("El nuevo tipo de cuenta de Juan es: "+cuentaDeJuan.tipoDeCuenta);

    }
}
