public class Main {
    public static void main(String[] args) {

        Alumno alumno;
        alumno = new Alumno();
        alumno.nombre = "Juan";
        alumno.edad = 13;

        System.out.println(alumno.nombre);
        alumno.caminar();
        alumno.comer();



    }
}