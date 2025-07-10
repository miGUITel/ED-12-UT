package POO_HerenciaSINConstructores;

// Clase Helicoptero (subclase de Aereo)
public class Helicoptero extends Aereo {
    public void ajustarColectivo() {
        System.out.println("El helicóptero " + nombre + " ha ajustado el colectivo.");
    }
}