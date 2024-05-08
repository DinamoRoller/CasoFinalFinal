**Apartado A**

El código imprimirá "1". La razón es que la funcion recursive se llama con los valores a=1 y b=-2. Como la condicion b==0 no se cumple, entonces pasa a la siguiente condición. Va pasando las condiciones hasta llegar a una que se cumpla, en este caso, hasta que b llegue a 0, momento en el que devuelve 1. 

Hay un error en el código. El caracter "|" en el main debería ser cambiado por el caracter "{". Además, hay un error en la lógica del algoritmo, ya que la función recursive no considera el caso en el que b sea negativo, lo que puede causar un bucle infinito. El código debería de ser así para que funcione:

```
import java.util.*;

public class Main {
  public static void main(String[] args) {
      int a = recursive(1, -2);
      System.out.println(a);
  }

  public static int recursive(int a, int b) {
    if (b == 0) {
          return 1;
      } else if (a == 0 || b < 0) {
          return 0;
      } else }
          return a * recursive(a, b -1);
      }
   }
}
```


**APARTADO B**

El algoritmo está calculando la potencia de un número a elevado a la b, utilizando recursividad. Cuando b es 0, devuelve 1, ya que cualquier número elevado a la potencia 0 es 1. Cuando a es 0 o b es negativo, devuelve 0, ya que cualquier número elevado a una potencia negativa es 0. De lo contrario, la función se llama a sí misma con b disminuyendo en 1 en cada iteración, multiplicando a por el resultado de la llamada recursiva, lo que produce la potencia de a elevado a b.
