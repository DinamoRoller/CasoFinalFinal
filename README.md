En este caso, para calcular de forma recursiva la suma, se siguen estos pasos:

1.Si el número es menor que 10, entonces tiene un solo dígito, por lo que se devuelve ese número.

2.Si el número tiene dos o más digitos, se obtiene el último dígito y se suma al resultado de llamar recursivamente a la función con el número sin el último dígito.

```
public class Main {
    public static void main(String[] args) {
       int number = 102;
       int sum = sumDigits(number);
       System.out.println(number + sum);
    }

public static int sumDigits(int number) {
   if (number < 10) {
       return number;
   } else {
       return number % 10 + sumDigits(number / 10);
   }
}
}
```

Este algoritmo emplea una recursividad descendente, ya que se llama a sí mismo directamente con un valor menor.
