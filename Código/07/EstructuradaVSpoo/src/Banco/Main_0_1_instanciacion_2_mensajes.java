package Banco;

public class Main_0_1_instanciacion_2_mensajes {
    public static void main(String[] args) {
        // Crear objetos de cuentas
    //1
        //Esto es una instanciación, es como crear una variable con un tipo de datos personalizado
        CuentaBancaria_0_POO_3_constructor cuentaOrigen = new CuentaBancaria_0_POO_3_constructor(123456, 500.0);
        //Compara con estructurada:
        //      int cuentaDestino = 789012;
        //      double saldoOrigen = 500.0;
        CuentaBancaria_0_POO_3_constructor cuentaDestino = new CuentaBancaria_0_POO_3_constructor(789012, 200.0);

        // Imprimir saldos después de la transferencia
    //2
        //Esto es un mensaje, la clase Main... solicita el uso de
        //un método de la clase CuentaBancaria
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();

        // Realizar la transferencia
        cuentaOrigen.transferir(cuentaDestino, 100.0);

        // Imprimir saldos después de la transferencia
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();
    }
}