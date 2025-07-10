package Calculadora;

public class Calculadora_4_cambiaEstado_5_calculaResultado {

    // Atributos
    private boolean estadoEncendido;
    private double resultado;

    // Métodos
//4
    //Este es un ejemplo de método que cambia el estado
    public void encender() {
        estadoEncendido = true;
        System.out.println("La Calculadora se ha encendido ahora.");
    }

    public void apagar() {
        estadoEncendido = false;
        resultado = 0; // Reiniciar el resultado al apagar la calculadora
        System.out.println("La calculadora se ha apagado ahora.");
    }

    public void verEstado() {
        System.out.println("\nESTADO ACTUAL__________________________________________________");
        System.out.println("El estado de la calculadora es encendido? = " + estadoEncendido);
        System.out.println("Resultado actual: " + resultado);
        System.out.println("________________________________________________________________\n");
    }

//5
    //Este es un ejemplo de método que calcula un resultado
    public void sumar(double num) {
        if (estadoEncendido) {
            resultado += num;
            System.out.println("Se sumó " + num + ". Nuevo resultado: " + resultado);
        } else {
            System.out.println("ERROR: La calculadora está apagada. Enciéndela antes de realizar operaciones.");
        }
    }

}
