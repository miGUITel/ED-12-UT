package POO_Abstraccion;

public class Coche1 {
    private String equipo;
    private String piloto;
    private int carreras;

    public Coche1(String equipo, String piloto, int carreras) {
        this.equipo = equipo;
        this.piloto = piloto;
        this.carreras = carreras;
    }

    public void repostar() {
        // Implementación del método repostar
        System.out.println("Repostando el coche del equipo " + equipo);
    }

    public void cambiarRueda() {
        // Implementación del método cambiarRueda
        System.out.println("Cambiando la rueda del coche del equipo " + equipo);
    }
}