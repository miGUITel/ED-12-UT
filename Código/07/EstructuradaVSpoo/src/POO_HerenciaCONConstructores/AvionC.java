package POO_HerenciaCONConstructores;

// Clase AvionC (subclase de AereoC)
public class AvionC extends AereoC {
    public AvionC(String nombre, String tipoCarga) {
        super(nombre, tipoCarga);
    }

    public void configurarFlaps() {
        System.out.println("El avión " + getNombre() + " ha configurado los flaps.");
    }
}