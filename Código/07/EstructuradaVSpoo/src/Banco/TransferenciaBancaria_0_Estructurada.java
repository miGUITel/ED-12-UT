package Banco;

public class TransferenciaBancaria_0_Estructurada {
    /*
    * EJEMPLO COMPARACIÓN PROGRAMACIÓN ESTRUCTURADA VS POO
    * Esta clase realiza una transferencia entre dos cuentas bancarias
    * En primer lugar se deben crear variables que almacenen los datos de ambas cuentas
    * A continuación se opera con las cuentas
    * */
    public static void main(String[] args) {
        // Definir datos de cuentas
        int cuentaOrigen = 123456;
        int cuentaDestino = 789012;
        double saldoOrigen = 500.0;
        double saldoDestino = 200.0;

        // Imprimir saldos antes de la transferencia
        System.out.println("Saldo de la cuenta origen nº: " + cuentaOrigen + " = " + saldoOrigen);
        System.out.println("Saldo de la cuenta destino nº: " + cuentaDestino + " = " + saldoDestino);

        // Realizar la transferencia
        System.out.println("Transferencia exitosa de 100 €");
        saldoOrigen -= 100.0;
        saldoDestino += 100.0;

        // Imprimir saldos después de la transferencia
        System.out.println("Saldo de la cuenta origen nº: " + cuentaOrigen + " = " + saldoOrigen);
        System.out.println("Saldo de la cuenta destino nº: " + cuentaDestino + " = " + saldoDestino);
    }
}