package POO_Encapsulamiento;

public class Lavadora1 {
    private String marca;
    private boolean encendida;
    private int edad;

    private void envejecer() {
        // Implementación del método privado envejecer
        edad++;
        System.out.println("La lavadora ha envejecido. Nueva edad: " + edad);
    }

    public void apagar() {
        // Implementación del método público apagar
        encendida = false;
        System.out.println("La lavadora ha sido apagada.");
    }
}