public class Lavadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    // Método para encender la lavadora
    public void encender() {
        if (!encendida) {
            System.out.println("Lavadora encendida.");
            encendida = true;
        } else {
            System.out.println("La lavadora ya está encendida.");
        }
    }

    // Método para lavar
    public void lavar() {
        if (encendida) {
            System.out.println("Lavando...");
        } else {
            System.out.println("Primero debes encender la lavadora.");
        }
    }

    // Método para apagar la lavadora
    public void apagar() {
        if (encendida) {
            System.out.println("Lavadora apagada.");
            encendida = false;
        } else {
            System.out.println("La lavadora ya está apagada.");
        }
    }
}
