## ENTORNOS DE DESARROLLO 
### REFACTORIZACIÓN ED4a1102 TAREA GRUPAL SIMULANDO REMOTO

**Entornos de Desarrollo (ED)**
**Unidad de Trabajo 11**
**Tarea 02**

## OBJETIVOS DE APRENDIZAJE

- Valorar la trascendencia del código limpio en el trabajo individual y en equipo.
- Aplicar los patrones de refactorización básicos.
- Escribir pruebas para refactorizar con seguridad.

# TA02 APLICA PATRONES DE REFACTORIZACIÓN A UN CÓDIGO

## **Tarea: Refactoriza con propósito** 

## ***ESTA TAREA SE REALIZARÁ SIMULANDO EL TRABAJO REMOTO, COMO HEMOS HECHO OTRAS VECES***

### **Herramientas necesarias**

* Editor de código (INTELIJ)
* Repositorio Git compartido con tus compañeros de grup
* Herramienta para comunicarte con ellos

---

### **Instrucciones**

1. Copiad el siguiente fragmento de código en un nuevo archivo llamado `CalculadoraFactura.java`:

```java
/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */
public class CalculadoraFactura {

    public static void calcular(double pb, double d) {
        
        double p = pb - (pb * d / 100);
        double t = p + (p * 21 / 100);

        System.out.println("El precio base es: " + pb);
        System.out.println("Descuento aplicado: " + d + "%");
        System.out.println("Impuesto aplicado: " + 21 + "%");
        System.out.println("El total a pagar es: " + t);
    }
}
```

2. Escribid las pruebas necesarias para refactorizar sin miedo.
3. Refactorizad el código **paso a paso**, aplicando los siguientes **cinco patrones en orden**:

   * `Rename Variable`
   * `Replace Magic Number with Symbolic Constant`
   * `Introduce Explaining Variable`
   * `Inline Variable` (cuando sea oportuno)
   * `Extract Method`

4. **Haced un commit después de aplicar cada patrón**, con un mensaje claro que indique qué patrón se ha usado y en qué parte del código.

5. Al finalizar, el programa debe seguir funcionando correctamente...

---

### **Entrega**

* Entregad un archivo `.zip` con la carpeta del proyecto y la carpeta `.git` incluida. Entregad todos el mismo archivo. Corregiré solo uno de ellos, aleatoriamente.

---

## **Guía de calificación**

| Nota   | Descripción del desempeño                                                                                                                                                                                                                                                                                                               |
| ------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **0**  | No se entrega la tarea, o el código no compila y no se ha refactorizado.                                                                                                                                                                                                                                                                |
| **3**  | Se ha realizado parte de la refactorización (2 o 3 patrones), pero hay errores importantes o no se han escrito las pruebas.                                                                                                                                                                                                     |
| **6**  | Se han aplicado correctamente 4 o 5 patrones, aunque alguno de forma superficial o con poca justificación. Se han escrito algunas pruebas.                                                                                                                                                                                 |
| **9**  | Se han aplicado los 5 patrones correctamente, el código mejora notablemente en legibilidad. Los commits están bien organizados y explicados. Las pruebas son suficientes y ayudan a refactorizar sin miedo a cometer errores.                                                                                                                                                                                    |
| **10** | El grupo realiza una aportación adicional |

---
