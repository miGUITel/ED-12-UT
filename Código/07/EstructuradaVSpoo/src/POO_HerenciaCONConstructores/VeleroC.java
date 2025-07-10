package POO_HerenciaCONConstructores;

// Clase VeleroC (subclase de AcuaticoC)
public class VeleroC extends AcuaticoC {
    public VeleroC(String nombre, String tipoAgua) {
        super(nombre, tipoAgua);
    }

    public void izarVelas() {
        System.out.println("El velero " + getNombre() + " ha izado las velas.");
    }
}