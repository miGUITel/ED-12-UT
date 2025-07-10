package POO_Encapsulamiento;

public class Lavadora2 {
    private String marca;
    protected String modelo;
    int edad; // Por defecto, el acceso es de paquete (sin modificador de acceso)

    public void encender() {
        // Implementación del método público encender
        System.out.println("La lavadora está encendida.");
    }

    public void apagar() {
        // Implementación del método público apagar
        System.out.println("La lavadora ha sido apagada.");
    }
}