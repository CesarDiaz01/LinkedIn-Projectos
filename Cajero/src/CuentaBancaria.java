public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;
    final double COMISION = 1.2;

    CuentaBancaria(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        this.saldo = saldo;
    }

    CuentaBancaria() {
        tipoDeCuenta = TipoDeCuenta.AHORRO;
    }


    void sacarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        double comision =0.0;
        if (tipoDeCuenta.equals(TipoDeCuenta.AHORRO)) {
            comision = COMISION;
        }
        saldo -= cantidad;
        saldo -= comision;
    }


    double calcularComision(){
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }

    }

    void ingresarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo() {
        return saldo;
    }
}






