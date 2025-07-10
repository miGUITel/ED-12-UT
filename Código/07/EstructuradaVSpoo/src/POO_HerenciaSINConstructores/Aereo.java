package POO_HerenciaSINConstructores;

// Clase Aereo (subclase de Vehiculo)
public class Aereo extends Vehiculo {
    private String tipoCarga;

    public void volar() {
        System.out.println("El vehículo aéreo " + nombre + " está volando con carga " + tipoCarga + ".");
    }
}