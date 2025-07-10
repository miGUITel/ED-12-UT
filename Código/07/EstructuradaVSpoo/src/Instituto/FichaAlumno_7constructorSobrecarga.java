package Instituto;

public class FichaAlumno_7constructorSobrecarga {
    /*
    * Esta clase tiene 5 atributos y 4 constructores diferenciados en el número de parámetros
    * que reciben.
    * En main, se instancian 4 objetos de la clase y se muestra su estado.
    * Para mostrar el estado se ha sobreescrito el método toString.
    * */
    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double notaMedia;

//7
    // Constructor por defecto
    public FichaAlumno_7constructorSobrecarga() {
    }

    // Constructor con nombre y apellidos
    public FichaAlumno_7constructorSobrecarga(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Constructor con nombre, apellidos y edad
    public FichaAlumno_7constructorSobrecarga(String nombre, String apellidos, int edad) {
        this(nombre, apellidos);
        this.edad = edad;
    }

    // Constructor con todos los atributos
    public FichaAlumno_7constructorSobrecarga(String nombre, String apellidos, int edad, String dni, double notaMedia) {
        this(nombre, apellidos, edad);
        this.dni = dni;
        this.notaMedia = notaMedia;
    }

    public static void main(String[] args) {
        // Constructor por defecto
        FichaAlumno_7constructorSobrecarga alumno1 = new FichaAlumno_7constructorSobrecarga();
        System.out.println("Alumno 1: " + alumno1);

        // Constructor con nombre y apellidos
        FichaAlumno_7constructorSobrecarga alumno2 = new FichaAlumno_7constructorSobrecarga("Juan", "Pérez");
        System.out.println("Alumno 2: " + alumno2);

        // Constructor con nombre, apellidos y edad
        FichaAlumno_7constructorSobrecarga alumno3 = new FichaAlumno_7constructorSobrecarga("María", "López", 20);
        System.out.println("Alumno 3: " + alumno3);

        // Constructor con todos los atributos
        FichaAlumno_7constructorSobrecarga alumno4 = new FichaAlumno_7constructorSobrecarga("Carlos", "Gómez", 25, "12345678X", 8.5);
        System.out.println("Alumno 4: " + alumno4);
    }
    // Método toString sobrescrito
    @Override
    public String toString() {
        return "FichaAlumno{" +
                "nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", edad=" + edad +
                ", dni=" + dni +
                ", notaMedia=" + notaMedia +
                '}';
    }

}
