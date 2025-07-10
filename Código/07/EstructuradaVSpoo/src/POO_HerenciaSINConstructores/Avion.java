package POO_HerenciaSINConstructores;

// Clase Avion (subclase de Aereo)
public class Avion extends Aereo {
    public void configurarFlaps() {
        System.out.println("El avión " + nombre + " ha configurado los flaps.");
    }
}