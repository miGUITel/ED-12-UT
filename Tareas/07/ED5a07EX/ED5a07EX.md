### Extracto del contenido del [repositorio](https://github.com/miGUITel/ED_POO_EX) para el examen
```java
package usuarios;

public class ProfesorTitular extends Profesor {
    private int experiencia;

    // Constructor
    public ProfesorTitular(String id, String nombre, String apellidos, String materia, int experiencia) {
        super(nombre, apellidos, materia);
        this.experiencia = experiencia;
    }

    // Métodos
    public void dirigirTesis() {}

    public void setId(String id) {
        this.id = id;
    }
}
```

### Ejemplo de pregunta verdadero o falso:
**El profesorTitular no puede modificar su id porque no tiene acceso al atributo debido a la visibilidad configurada.**

a. Verdadero

b. Falso
