package POO_HerenciaCONConstructores;

// Clase HelicopteroC (subclase de AereoC)
public class HelicopteroC extends AereoC {
    public HelicopteroC(String nombre, String tipoCarga) {
        super(nombre, tipoCarga);
    }

    public void ajustarColectivo() {
        System.out.println("El helicóptero " + getNombre() + " ha ajustado el colectivo.");
    }
}