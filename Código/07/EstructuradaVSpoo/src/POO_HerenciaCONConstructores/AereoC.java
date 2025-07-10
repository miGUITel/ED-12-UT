package POO_HerenciaCONConstructores;

// Clase AereoC (subclase de VehiculoC)
public class AereoC extends VehiculoC {
    private String tipoCarga;

    public AereoC(String nombre, String tipoCarga) {
        super(nombre);
        this.tipoCarga = tipoCarga;
    }

    public void volar() {
        System.out.println("El vehículo aéreo " + getNombre() + " está volando con carga " + tipoCarga + ".");
    }
}