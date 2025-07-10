package POO_HerenciaSINConstructores;

// Clase Barco (subclase de Acuatico)
public class Barco extends AcuaticoVerERROR {
    public void encenderMotor() {
        System.out.println("El barco " + nombre + " ha encendido el motor.");
    }
}