package POO_HerenciaCONConstructores;

// Clase BarcoC (subclase de AcuaticoC)
public class BarcoC extends AcuaticoC {
    public BarcoC(String nombre, String tipoAgua) {
        super(nombre, tipoAgua);
    }

    public void encenderMotor() {
        System.out.println("El barco " + getNombre() + " ha encendido el motor.");
    }
}