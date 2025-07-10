package POO_HerenciaCONConstructores;

// Clase Vehiculo
public class VehiculoC {
    private String nombre;

    public VehiculoC(String nombre) {
        this.nombre = nombre;
    }

    public void transportar() {
        System.out.println("El vehículo " + nombre + " está transportando.");
    }

    public String getNombre() {
        return nombre;
    }
}
