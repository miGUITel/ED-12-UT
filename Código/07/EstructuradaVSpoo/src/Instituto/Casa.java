package Instituto;

/*
* Con este código explicamos
* (1) que si no implemento un constructor en una clase
* (Puerta en este caso) siempre existe un contructor por defecto.
* public Puerta() en este caso
* (2) que si implemento un constructor personalizado
* public Puerta(int anyos) en este caso
* el constructor por defecto deja de existir
* (se puede reimplementar)
* */

public class Casa {
    public static void main(String[] args) {

        Puerta mipuerta = new Puerta();

        //mipuerta.abrir();

    }


}
