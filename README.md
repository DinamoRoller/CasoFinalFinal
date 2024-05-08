1-C

2-Una tabla Hash y un árbol son estructuras de datos utilizadas para almacenar y organizar datos, pero son diferentes en su implementación, rendimiento y aplicaciones.

Implementación: Una tabla Hash usa una función Hash para mapear claves a ubicaciones en una tabla de dispersión, mientras que un árbol es una estructura jerárquica que consta de nodos conectados por enlaces.

Rendimiento: En el Hash, el tiempo de acceso promedio es =(1) pero puede variar según la función hash y la cantidad de colisiones. En el otro lado, el tiempo de acceso promedio en un árbol depende de su altura y puede variar desde O(log n) hasta O(n) en el peor de los casos.

Aplicaciones: En el caso Hash, se utiliza cuando se necesita un acceso rápido a los datos y no es necesario mantener un orden específico de los elementos, por lo que resulta ideal para buscar y recuperar elementos por claves únicas. En el arbol, se utiliza cuando se necesita mantener un orden especifico de los elementos y realizar operaciones de búsqueda y eliminación eficientes. Es útil cuando se requiere iterar sobre los elementos en un orden específico, como en un árbol de búsqueda binaria.

3-Las pilas y las colas son estructuras de datos lineales que se utilizan para almacenar elementos y acceder a ellos de manera específica. Se diferencian en las características y aplicaciones.

Características: En las pilas, se sigue el principio LIFO (Last in, First out), lo que significa que el último elemento insertado es el primero en ser reiterado, mientras que las colas siguen el principio FIFO (First in, First out), lo qie significa que el primer elemento insertado es el primero en ser reiterado.

Aplicaciones: En las pilas, se utiliza en problemas que implican reversión de datos, evaluación de expresiones, historial de navegación en un navegador web, entre otros. En el otro caso, en las colas se utiliza en problemas que implican tareas que deben procesarse en el orden en que se reciben, como la gestión de trabajos en un sistema de impresión, el enrutamiento de paquetes en redes de comunicación, etc.

4-El método de ordenación por inserción es un algoritmo sencillo y eficiente para ordenar elementos en una lista o arreglo. Básicamente, toma un elemento de la lista en cada iteración y lo inserta en la posición correcta entre los elementos que ya están ordenados.

Iteración 1: 20 50 84 13 22 16 89 85

Iteración 2: 20 50 84 13 22 16 89 85

Iteración 3: 13 20 50 84 22 16 89 85

Iteración 4: 13 20 22 50 84 16 89 85

Iteración 5: 13 16 20 22 50 84 89 85

Iteración 6: 13 16 20 22 50 84 89 85

Iteración 7: 13 16 20 22 50 84 85 89

5- A=B

Sustituimos

1024n=16n^3

Se simplifica diviendo ambos lados por 16

64=n^2

Pasamos el cuadrado como raíz al otro lado

n=\/64

n= 8

Por lo tanto, a partir de n=8 la función A será mas eficiente que B.
