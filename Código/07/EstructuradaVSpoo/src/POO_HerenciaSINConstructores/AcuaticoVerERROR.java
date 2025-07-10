package POO_HerenciaSINConstructores;

// Clase Acuatico (subclase de Vehiculo)
public class AcuaticoVerERROR extends Vehiculo {
    private String tipoAgua;

    //¿Por qué hay un error al acceder a nombre?
    public void navegar() {
        System.out.println("El vehículo acuático " + nombre + " está navegando en " + tipoAgua + ".");
    }
}

//OPCIONES PARA ARREGLARLO
//1 getter público en Vehiculo
//2 cambiar la visibilidad de Vehiculo.nombre -> probar este cambio, debe solucionar todos los errores en las subclases
//3 crear un constructor que llame a super (ver paquete POO_HerenciaCONConstructores)