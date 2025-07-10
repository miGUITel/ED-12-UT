
## ENTORNOS DE DESARROLLO 
### PRUEBAS UNITARIAS CON JUNIT ED3c1001

**Entornos de Desarrollo (ED)**
**Unidad de Trabajo 10**
**Tarea 01**

## OBJETIVOS DE APRENDIZAJE

- Escribir pruebas unitarias.
- Ejecutar pruebas unitarias.

# TA01 CALCULADORA

### Descripción de la tarea

Desarrolla una **calculadora básica** que contenga las siguientes operaciones:

- Suma
- Resta
- Multiplicación
- División

Cada operación debe implementarse como un **método independiente**.

Además, deberás escribir **tres pruebas unitarias** para cada método utilizando **JUnit**.

---

### Instrucciones de desarrollo

1. **Crea un nuevo proyecto** en IntelliJ llamado `CalculadoraBasica`.

2. **Estructura del proyecto:**

   - Dentro del paquete `src`, crea una clase llamada `Calculadora`.
   - Dentro del paquete `test`, crea una clase llamada `CalculadoraTest`.

3. **Implementa la clase `Calculadora`** con los siguientes métodos:

```java
public int sumar(int a, int b)
public int restar(int a, int b)
public int multiplicar(int a, int b)
public int dividir(int a, int b)
```

4. **Escribe las pruebas unitarias** en la clase `CalculadoraTest`:

   - Cada método de la calculadora debe tener **tres pruebas** distintas.
   - Utiliza `@Test` para marcar cada prueba.

5. **Ejecuta las pruebas** para verificar que tu código funciona correctamente.

---

### Entrega

Debes entregar:

- El proyecto completo con las siguientes carpetas:
  - `src` con la clase `Calculadora.java`
  - `test` con la clase `CalculadoraTest.java`

- **Una memoria en PDF** que incluya:
  - Una breve explicación de los pasos seguidos.
  - Un recorte de pantalla del código de los métodos.
  - Un recorte de pantalla del código de los tests.
  - Un recorte de pantalla del resultado de las pruebas todas positivas.


### Checklist de entrega

- [x] Clase `Calculadora` con los cuatro métodos.
- [x] Clase `CalculadoraTest` con doce pruebas (tres por método).
- [x] Todas las pruebas pasan correctamente.
- [x] Memoria en PDF con explicación y recortes.

---

## Rúbrica

| Calificación | Descripción                                                                                                                                           |
| ------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| 0            | No se entrega la tarea o se entrega sin sentido ni conexión con el enunciado                                                                          |
| 3            | Se crea el proyecto de la calculadora pero no las pruebas                                |
| 6            | Además, se escriben todas las pruebas        |
| 9            | Además, se superan todas las pruebas y la memoria es correcta |
| 10           | Se han aportado elementos personales más allá de lo solicitado   |