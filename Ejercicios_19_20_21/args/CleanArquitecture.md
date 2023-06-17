Clean Architecture

La arquitectura limpia esta basada en capas debilmente acopladas entre si.

      La regla de dependencia unilateral establece que las dependencias del código fuente solo pueden apuntar hacia adentro,
      es decir de las capas externas a la interna.
      La capa mas externa representa a el software de bajo nivel.
      La capas mas internas representan el software de alto nivel.
 
El orden de dependencia seria el siguiente:

        Frameworks and Managers
        
        Adaptadores de interfaz.
        
        logica de aplicacion(Casos de uso)
        
        logica de negocio (Reglas de negocio)

    El primero depende del siguiente, asi sucesivamente.
    
    La razon de ser de los adaptadores de interfaz, es que se pone en practica el principio de inversion de dependencia,
    para sostener la dependencia unilateral donde las capas externas dependan solo de las internas.
    
    Entendiendo que los frameworks y Managers vendrian a ser la capa mas externa y la logica de negocio la mas interna
      y la que no tiende a variar.


Principles SOLID

1. S -> Single Responsibility Principle (SRP)- Principio de Responsabilidad Unica

Una clase debería tener una, y solo una, razón para cambiar”. Es esto, precisamente, “razón para cambiar” es la que se 
denomina responsabilidad unica.

2. O -> Open/Closed Principle (OCP) - Principio de Abierto/Cerrado

"Deberías ser capaz de extender el comportamiento de una clase, sin modificarla”. En otras palabras: las clases que usas 
deberían estar abiertas para poder extenderse y cerradas para modificarse.

3. L -> Liskov Substitution Principle (LSP) - Principio de Sustitución de Liskov

“las clases derivadas deben poder sustituirse por sus clases base”.

Esto significa que los objetos deben poder ser reemplazados por instancias de sus subtipos sin alterar el correcto 
funcionamiento del sistema o lo que es lo mismo: si en un programa utilizamos cierta clase, deberíamos poder usar 
cualquiera de sus subclases sin interferir en la funcionalidad del programa.  

4. I -> Interface Segregation Principle (ISP) - Principio de Segregación de la Interfaz

“Haz interfaces que sean específicas para un tipo de cliente”, es decir, para una finalidad concreta.
Es preferible contar con muchas interfaces que definan pocos métodos que tener una interface forzada 
a implementar muchos métodos a los que no dará uso.

5. D -> Dependency Inversion Principle (DIP) - Principio de Inversión de Dependencias

Llegamos al último principio: “Depende de abstracciones, no de clases concretas”.

Así, Robert C. Martin recomienda:

Los módulos de alto nivel no deberían depender de módulos de bajo nivel. Ambos deberían depender de abstracciones.
Las abstracciones no deberían depender de los detalles. Los detalles deberían depender de las abstracciones.
El objetivo del Dependency Inversion Principle (DIP) consiste en reducir las dependencias entre los módulos del código, 
es decir, alcanzar un bajo acoplamiento de las clases.


Caso en la que se utilizaria Clean Architecture 

Se podria utilizar en proyectos a largo plazo , donde los cambios van a ser parte del desarrollo del software.En este 
tipo de proyecto existe la necesidad de minimizar los impactos de los cambios.Como una aplicacion web compleja. Donde 
se requiere de interfaces para mantener las capas desacopladas.Las de bajp nivel deberian ser facilmente sustituibles 
sin que la aplicacion sufre algun impacto,









