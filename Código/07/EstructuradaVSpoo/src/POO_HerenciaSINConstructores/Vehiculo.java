package POO_HerenciaSINConstructores;

public class Vehiculo {
    //canbiar a private para ver el error
    public String nombre;

    public void transportar() {
        System.out.println("El vehículo " + nombre + " está transportando.");
    }
}

/*
  Creo el paquete POO_HerenciaSINConstructores que muestra la herencia en dos niveles,
  con Vehículos, subtipos y tipos de vehículos.
  Este primer paquete no presenta constructores encadenados, es solo para ver cómo se implementa la herencia.
   Las subclases no pueden acceder al atributo nombre de la superclase, se propone buscar cual es el fallo
   y en la clases AcuaticoVerERROR se barajan tres soluciones.
 */
