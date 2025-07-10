package POO_HerenciaCONConstructores;

// Clase Acuatico (subclase de Vehiculo)
public class AcuaticoC extends VehiculoC {
    private String tipoAgua;

    public AcuaticoC(String nombre, String tipoAgua) {
        super(nombre);
        this.tipoAgua = tipoAgua;
    }

    public void navegar() {
        System.out.println("El vehículo acuático " + getNombre() + " está navegando en " + tipoAgua + ".");
    }
}