package POO_Encapsulamiento;
/*Hay tres tipos de Lavadoras, según el diagrama de clases de ppt
* cada una de ellas tiene una combinación de modificadores de visibilidad
* El siguiente código muestra cómo cada una de las Lavadoras permite el acceso o no
* a cada uno de sus miembros*/

public class Casa {
    //Atributos
    Lavadora1 lavadora1;
    public Lavadora2 lavadora2;
    public Lavadora3 lavadora3;

    // Constructor que instancia las lavadoras al construir una casa
    public Casa() {
        lavadora1 = new Lavadora1();
        lavadora2 = new Lavadora2();
        lavadora3 = new Lavadora3();
    }

    public static void main(String[] args) {
        // Construir una casa (las lavadoras se instanciarán en el constructor)
        Casa miCasa = new Casa();

        // Acceder a los atributos y métodos desde el main

        // Lavadora1
        // Atributos privados
        // miCasa.lavadora1.marca = "Bosh"; // No se puede acceder directamente a marca
        // miCasa.lavadora1.encendida; // No se puede acceder directamente a encendida
        // miCasa.lavadora1.edad; // No se puede acceder directamente a edad

        // Métodos públicos
        miCasa.lavadora1.apagar(); // Se puede acceder al método público apagar
        // miCasa.lavadora1.envejecer(); // No se puede acceder directamente al método privado envejecer

        // Lavadora2
        // Atributos privados
        // miCasa.lavadora2.marca; // No se puede acceder directamente a marca
        // miCasa.lavadora2.modelo; // No se puede acceder directamente a modelo
        // miCasa.lavadora2.edad; // No se puede acceder directamente a edad

        // Métodos públicos y protegidos
        miCasa.lavadora2.encender(); // Se puede acceder al método público encender
        miCasa.lavadora2.apagar(); // Se puede acceder al método público apagar

        // Lavadora3
        // Atributos públicos
        System.out.println("Marca de la lavadora3: " + miCasa.lavadora3.marca); // Se puede acceder directamente a marca
        // System.out.println("Modelo de la lavadora3: " + miCasa.lavadora3.modelo); // No se puede acceder directamente a modelo (es de paquete)
        System.out.println("Edad de la lavadora3: " + miCasa.lavadora3.edad); // Se puede acceder directamente a edad

        // Métodos públicos
        miCasa.lavadora3.encender(); // Se puede acceder al método público encender
        miCasa.lavadora3.apagar(); // Se puede acceder al método público apagar
    }
}