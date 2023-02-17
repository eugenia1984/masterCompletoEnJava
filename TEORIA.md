# :star: SECCION 1 - INTRODUCCION

### Temas

- Fundamentos de Java SE: variables, tipo de datos primitivos y referencia, operadores, flujos de control, clase String, clase wraper, System, Math, Random, Date y Calendar, Arrays y Matrices, Clases y Objetos, Principios de POO (abstracción, encapsulamiento, polimosfismo, herencia, modularidad), clase abstracta

- Componentes más avanzados de Java SE: colecciones (Collection, List, Set, Map), manejo de excepciones, manejo de archivos (FIles), tipos genéricos (Generics), API stream, expresiones Lambda y CLosure, Optional, Multi-hilos (Thread), Base de Datos (JDBC) con MYSQL y PostgresSQL, hibernate/JPA, DAO (Data Access Object), GUI Swing, RXJava Reactive Strem(programación funcional y reactiva)

- Java EE(Enterprice): MVC(Model View Controller), Servidor JBoss WildFly, API Servlet/JSP, Java Server Face JSF 2 , Eld CDI, EJB 3, API REST; SOAP, JAAS Autenticación y Autorización, Spring 5, Struts 2

---

## Instalacion JDK

https://oracle.com/java -> Desde la versión 14 (Java SE 14) en adelante, también es compatible con versiones anteriores.

Y configurar el PATH(el path con el  bin incluida) y HOME_JAVA(elpath sin el slash y bin) en variables de usuario

---

## IntelliJ IDEA

El IDE para Java, desde jetbrains.com se puede descargarlo.

Está la ultimate(de pago) y la Community(free).

Vamos a usar la Community

---

## Introducción a Java

- En 1995 desarrollado por Sun MicroSystem, para tarjetas inteligentes y sintonizadores de TV

- Equipo de 13 personas al mando de James Gosling, fueron "The Green project".

- Basado en C++, POO, con garbage colector. Inicialmente fue llamado Oak y luego renombrado a Java.

- En 1996 fue lanzado publicamente con HotJava de soporte web.

- Luego de 1998 Jva EE(Enterprise Edition)

- Lenguaje multiplataforma : **Escribelo una vez y ejecutalo donde quieras**.

- Lenguaje independiente al sistema operativo con un entorno de ejecucion llamado JVM (Java Virtual Machine)
```
codigo      java      bytecode  -> JVM(Mac)
fuente  -> compiler -> (.class) -> JVM(Linux)
(.java)                         -> JVM(Windows)
```

Todo codigo Java se compila en un lenguej intermedio que no es 100% binario, esta justo entremedio de la maquina y el código fuente y se le conoce como Bytecode.

En tiempo de ejecuci{on se interpreta el byte code en código binario o de maquina(0 y 1)}


#### Características

- Muchos tipos de aplicaciones: consola, ventna, web, distribuidas, etc

- Multiplataforma

- POO

- Recolector de Basura (garbage colector), se evita fuga de memoria

- Polimorfismo, implementación de interfases, sobrecarga de métodos, herencia, etc

- Modularidad, más mantenible

- Principio de ocultación

- Lenguaje fuertemente tipado

---

### Crear el primer proyecto Hola Mundo

IntelliJ -> Create New Project -> y completamos: Name / Location / Languaje: Java / Build System: IntelliJ
-> Create


```Java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

-> Por consola se ve *Hello World*

**public** es un modificador de acceso, se puede ejecutar desde cualquier parte dela aplicación

**void** sin retunr en el metodo, solo ejecuta un proceso

recibe **args** argumentos de tipo String que es un Array

Las {} limitan el alcance del método, es el cuerpo

**class** porque es una clase


**psvm** -> es el shortcut para crear la clase main


---

# :star: SECCION 2 - VARIABLES


## Introducción a las variables

Una declaración de **variable** tiene dos partes:

**TipoDeDato nombreDeLaVariable;**

El tipo de la variable determina los valores que la variable puede contener y laas operaciones que se pueden realizar con ella.

-> Desde Java versión 10 hay **var**, es un tipado dinámico.

- Hay dos categorías de tipo de dato:

-**PRIMITIVOS**: un solo valor e incluyen: int(integer / entero), float(flotante / decimal), character, boolean. No son un objeto, son valores.

-**REFERENCIADOS**: arrays, clases e interfaces(un contrato de implementación)

## Reglas para definir variables

- Los nombres de las variables empiezan con una letra minúscula

- Debe ser un juego de caracteres comprendido en la codificación Unicode

- No puede ser el mismo que una palabra clave (reservada del lenguaje) o el nombre de un valor boolean (true o false)

-> Palabras reservasdas: abstract, boolean, break, byte, byvalue, case, catch, char, class, continue, const,  default, do, double, else, extends,  false, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long,  native, new, null, package, private, protected, public, return, short, static,  synchronized, switch, super, try, this, transient, threadsafe, throw, true, void, while

- No debe tener el mismo nombre que otras variables cuyas declaraciones aparezcan en el mismo ámbito

- Si una variable está compuesta de más de una palabra, como nombreDato, se utiliza camelCase

- Puede comenzar por una letra, un subrayado o un simbolo de dólar, siendo los sigueintes caracteres letras o dígitos.

---

## PRIMITIVOS

Son tipos de datos escalares que contienen un solo valor.

El tipo de dato se escribe enteramente en min{uscula.

Pueden ser:

- **enteros**: byte(8bits), short(16nits), int(32bits), long(64bits).

Un entero es del conzunto Z = {..., -2, -1, 0, 1, 2, ...}

Difieren en las precisions y pueden ser positivos o negativos

```Java
// -128 a 127
byte enteroByte = 127;
// -32768 a 32767
short enteroShort = 32767;
// -2147483648 a 214748367
int enteroInt = 2147483647;
// - 9223372036854775808 a 9223372036854775807
long enteroLong = 922337203685477501;
```
-Clase wraper: Byte, Short, Integer, Long

-Valor por defecto: 0

- **float**(**reales**): float(precision simple)(32bits), double(doble precision o reales)(64bits). Núumeros reales con coma(que es con el **.**).

```Java
// 34,4E-45 a 3,402028235E38
float realFloat = 3.1416f; // la f por ser float
double realDouble = 4.7029235E3
```

-Clase wraper: Float, Double

-Valor por defecto: 0.0f , 0.0d

- **char**(character): usar el unicode. Van entre **comillas simples**
```Java
char a = 'a';
char c = '\u0021'; // !
```

| secuencia de escape | simbolo |
| ------------------- | ------- |
| \ b | retroceso | 
| \ n | nueva linea |
| \ r | retorno de carro |
| \ t | tabulador |
| \ \ | diagonal invertida |
| \ " | comillas dobles |

-16 bites

-Clase wraper: Character

-Valor por defecto: u0000

- **boolean**: true ó false.
```Java
boolean verdadero = true;
boolean falso = false;
```

-1 bit

-Clase wraper: Boolean

-Valor por defecto: false

---

:computer: Para ver ejemplos en código...

...en la clase **PrimitivosEnteros** estan los ejemplos numeros enteros y en **PrimitivosDecimales** decimales

...en la clase **PrimitivosCaracter** estan los ejemplos de characters.

... en la clase **PrimitivosBoleanos** estan los ejemplos de boolean.

... en la clase **SistemasNumericos** estan los ejemplos de: decimal, binario, octal y hexadecima.

... en la clase **SistemaNumerico** hay ejemplos de Sistemas númericos y entradas de datos desde ventana de dialogo, por la terminal y por una ventana(API de Java - **JOptionPane**) y también de manejo de errores con try-catch.

... en la Clase **SistemasNumericosEntradaScanner** hay ejemplos de codigo de Sistemas númericos y entradas de datos desde el terminal con la clase **Scanner**.

... en la clase **ConversionDeTipo** hay ejemplos en codigo de Conversión de cadenas a primitivos. Y también hay ejemplos de Conversiones de tipo primitivos a cadenas con la clase wraper o con String.valueOf(). Y también hay Conversiones entre tipos primitivos

---

# :star: SECCION 3 - STRING

---

- Los **String** son objetos de java, del tipo de referencia:
```Java
String nombre = new String("Eugenia");
String tema = new String("Manejo de \"String\"");
```

- Aunque también los String se pueden representar con una sintaxis especialmenter cómoda.

### Concatenacion

- Con +:

```Java
String nombre = "Maria Eugenia";
String apellido = "Costa";
String nombreCompleto = nombre + " " + apellido;
```

### Comparación

- Con el operador relacional de igualdad == compara por referencia

- Con el método equals() compara por valor

```Java
String str1 = "Hola Euge";
String str2 = new String("Hola Euge");

System.out.printIn("Son el mismo objeto ?" + (str1 == str2));

System.out.printIn("Tienen el mismo valor?" + str1.equals(str2));
```

### Métodos de la clase String

| Metodo | que hace |
| ------ | -------- |
| int lenght() | número de caracteres |
| boolean equals(String b) | compara si ambas son iguales, independientemente e mayusculas o minusculas |
| int compareTo(String b) | compara contra la cadena del argumento devolviendo: valor negativo(si la cadena es anterior a b), cero(si es igual a b), un valor positivo(si la cadena es posterior a b) |
| String trim() | crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al pricipio o al final |
| char charAt(int posicion) | extrae un caracter en la posicion indicada |
| char[] toCharArray() | convierte la cadena en un arreglo de caracteres |
| String substring(int a, int b) | extrae la sub-cadena entre las posiciones a y b |
| String substring(ins desde) | extrae la sub-cadena desde la posición indicada |
| int indexOf(String cadena) | indica en que posicion se encuentra el caracter o cadena indicado por primera vez, buscando desde el principio |
| int lastIndexOf(String cadena) | indica en que posicion se encuentra el caracter o cadena indicado por primera vez, buscando desde el principio |
| boolean startsWith(String prefijo) | dice si la cadena comienza con el prefijo indicado |
| boolean endsWith(String prefijo) | dice si la cadena termina con el prefijo indicado |
| String[] split(String patron) | divide la cadena en varias subcadenas utilizando el patrón indicado como separador |

---

## Ejemplo en codigo

:coumputer: Se puede ver ejemplos de código en la carpeta **SeccionString** con las clases:

- **EjemploString**

- **EjemplosStringConcatenacion**

- **EjemplosStringInmutable**

- **EjemploStringRendimiento**, test rendimiento concatenar con operador + vs método concat() vs StringBuild)

- **EjemploStringValidar**: isEmpty()

- **EjemploStringMetodos**: length(), toUpperCase(), toLowerCase(), equals(), equalsIgnoreCase(), compareTo(), charAt(), replace(), indexOf(), lastIndexOf(), contains(),  startsWith(), endsWith(), trim()

- **EjemploStringExtensionArchivo**

- **EjemplosStringMetodosArreglos**: toCharArray()

---

# :star: SECCION 4 - OPERADORES

---

Java proporciona muhcos tipos de operadores que se pueden usar según la necesidad. Se clasifican según la funcionalidad que brindan.

Sirven para realizar cálculos, coparar valores, para unir identificadores y literales, para formar expresiones lógicas, toma de deciciones, etc.

---

## OPERADORES ARTIMÉTICOS

Operaciones aritméticas simples en tipos de datos primitivos

```
multiplicaicon *
division /
suma +
resta -
modulo/resto %
incremento ++
decremento --
```

- Operadores combinados o compuestos: ``` -=, +=, /=, *=```, etc

```a += a``` equivale a : ``` a = a + 5```

---

## OPERADOR INCREMENTO / DECREMENTO

Utilizado para incrementar o decrementar el valor en 1. Hay dos variedades de operador de incremento pre y post

| Ejemplo | Nombre | Efecto |
| ------- | ------ | ------ |
| ++a | pre-incremento | incrementa a en 1 y luego devuelve a |
| a++ | post-incremento | devuelve a y luego incrementa en 1 |
| --a | pre-decremento | decrementa a en 1 y luego devuelve a |
| a-- | post-decremento | devuelve a y luego descrementa en 1 |

```Java
ina a = 1;
int b = ++a;  // a y b valen 2
a = 1;
b = a++; // a vale 2 y b 1
```

Se puede colocar tanta antes como después de la expresión que deseemos modificar pero sólo devuelven el valor modificado si están delante.

---

## OPERADOR TERNARIO O CONDICIONAL

El operador ternario es una versión abreviada de las sentencias IF-ELSE.

Tiene tres operandos y de ahí el nombre ternario.

```
(condicion)?valorTrue:valorFalse;
```

Si la condición se cumple devuelve el primer valor y en caso contrario el segundo.

```Java
int a = 2 > 3 ? 1 : 2; // a = 2
```

---


## OPERADORES RELACIONALES

Se utilizan para comprobar relaciones de igualdad, mayor que, menor que, etc.

Devuelven un resultado booleano después de la comparacióon, true si la comparación fue exitosa y falso si no lo fue

Se usan ampliamente en las sentencias if/else, asi como en blucles.

```
> mayor que
>= mayor o igual que
< menor que
<= menor o igual que 
== igual que
!= distinto que
```

---

## OPERADORES LÓGICOS


| Nombre | Operador | Resultado |
| ------ | -------- | --------- |
| AND | && | TRUE si ambos son true |
| OR | `||` | TRUE si al menos uno es true |
| NOT | ! | cambia al opuesto |
| and | & | TRUE si ambos son true. Siempre evalua ambos operandos |
| or | `|` |  TRUE si al menos uno es true. Siempre evalua ambos operandos |
| xor | ^ | cambia al opuesto |



```
 A     B     And   Or    Not  Xor
true  true  true  true  false 0
true  false false true  false 1
false true  false true  true  1
false false false false true  0
```

---

## PRECEDENCIA DE OPERADORES

```
++ -- + - !
()          
* / %       
+-         
> >= < <= instance of
== !=
&&
||
() ? :
= += -= *= /= %=
```

---

## OPERADORES DE ASIGNACIÓN

Cuando declaramos la variable y le asignamos el valor con: =.

```
=
```

---

## OPERADORES UNITARIOS

En matemática se lo conoce como multiplicar por -1, invierte el signo del número.

`- * - -> +`

`- * + -> -`

---

## ARRAY

Permite guardar datos del mismo tipo

No son dinámicos, por lo que debo indicar la dimension

---

:coputer: Hay ejemplos de código en la carpeta **SeccionOperadores** con las clases:

- **OperadoresAritmeticos**

- **OperadoresAsignacion**

- **OperadoresUnarios**

- **OperadoresIncrementales**

- **OperadoresRelacionales**

- **Operadores lógicos**

- **OperadoresLogicosLogin**

- **OperadoresLogicosLoginArrays**

- **OperadorTernario**: es una versión abreviada de un if-else

- **OperadoresLogicosLoginArraysTernario**: rehago el ejemplo del loguin, pero reemplaso los if-else por ternarios

- **OperadorTernarioNumeroMayor**

- **OperadorInstanceOf** nos permite si una instancia, un objeto es referencia de un tipo (clase, interfaz, clase abstracta) o un sub tipo(clase que extienda de otra, si el tipo es ansestro de un objeto).

Todas las clases derivan de Object. Es la clase padre de todos los objetos

Double, Integer, Short y Long heredan de Number

Siempre se ve con las clases wraper, no con los datos primitivos

- **OperadorInstanceOfGenericos**

---

## :star: SECCION 5 - FLUJOS DE CONTROL

---

## IF

Ejecuta un bloque de código si la condición es verdadera, de lo contrario no ejecuta nada
`
if(expresion) {
// ejecuta este bloque
}
`

---


## IF - ELSE

Si la condición no es verdadera, en vez de ejecutar el bloque de código del if, ejecuta el del else.

`
if(expresion) {
// ejecuta este bloque si comple
} else {
// ejecuta si no se cumple
}
`

---

## IF - ELSE IF - ELSE

Se encadenan condiciones

`
if(expresion) {
// ejecuta este bloque si comple
} else if(expresion2) {
// ejecuta este bloque su cumple expresion2
} else {
// ejecuta si no se cumple
}
`

---

## SWITCH CASE

La sentencia o interruptor se utiliza para realizar sentencias condicionalmente basadas en alguna expresión.

De acuerdo al valor de la expresión se ejecuta la sentencia case apropiada.

Se compara tipos: int, byte, short, char, String y enum.


Con break corta y sale del switch, no sigue ejecutando los bloques que le siguen.

`
switch(variable) {
case valor1:
// ejecuta sentencia1
break;
case valor2:
// ejecuta sentencia 2
break;
default:
// si no hay coincidencia, se ejecuta sentencia default
}
`

---

## WHILE


Ejecuta un bloque de código mientras se cumpla la condición.


Es unu esructura de iteración precondición, primero evalúa la expresión antes de ejecutar cualquiera instancia.

`
while(expresion) {
// bloque a ejecutar
}
`
---

## DO WHILE

Similar al while, excepto en que la expresión se evalúa al final del bucle, se ejecuta al menos una vez.

Es una estructura de iteración postcondición, primero ejecuta la sentencia y al final evalúa la expresión.

`
do {
// bloque a ejecutar
} while(expresion)

---

## FOR

La sentencia FOE se utiliza cuando se conocen los limites del bucle, su condición de término y su instrucción de incremento/decremento.

`
for(inicializacion; condicion; incremento) {
// bloque a ejecutar si cumple condicion
}
`

Ejemplos:

- inicializaicón: `int i = 0`

- condición: `i <10`

- incremento: `i++`

---

### SEPARADORES

Existen caracteres en Java con significado especial, son los SEPARADORES:

() para contener condiciones en sentencias de flujo. Contienen listas de parámetros, tanto en la definición de un método como en la llamada al mismo. También se utilizan para modificar precedencia. Y para realizar conversiones de tipo.

{} para definir bloques de código, definir ámbitos. Para contener los valores iniciales de los arreglos.

[] para declarar arreglos o matrices y para referenciar valores dentro de los mismos

; separa sentencias. Se utiliza para encadenar sentencias dentro de una estructura.

. Separa un nombre de atributo o método de una variable de referencia u objeto. También separa nombre de paquete de los de un subpaquete o una clase.

---

## Ejemplos en codigo

En la carpeta SeccionFlujosControl, con las clases:

- **SentenciaIfElse**, acorde a un promedio informar como viene, con varias sentencias.

- **SentenciaIfElseNumDiaMes**, para calcular si un año es bisiesto.

- **SentenciaSwitchCase**

- **SentenciaSwitchNumDiaMes**

- **SentenciaFor**

- **SentenciaForArreglo**

---

# ARRAYS

- Son tipos de datos de referencia que contienen varios elementos ordenados, una colección.

- Sus elementos o valores están asociados a una llave o índice y puede contener tipos de referencia o primitivos.

- Siempre asociado a un solo tipo de datos.

- Comienza en índice 0 su primer item.

- Tienen una dimensión fija, no es dinámico, de necesitar dinamismo se usan las colecciones.

### Declaración e instanciación

```Java
int[] numeros;
int[] numeros2 = new int[3]; // ya le asigno dimensión
// Tambien pueden ser de objetos
// No solo primitivos
Producto[] productos = new Producto[3];
```

### Inicialización

```Java
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;

productos[0] = new Productos("Mesa comedor");
productos[1] = new Productos("TV LED 42 pulgadas");
productos[2] = new Productos("Sofa");
```

### Obtener elementos

```Java
int num1 = numeros[0]; // 1

Producto mesa = productos[0]; // Mesa comedor
```

### Declaración, instanciación e inicialización de un array

```Java
int[] numeros = {1, 2, 3};

Producto[] productos = {new Producto("Mesa"), new Producto("Televisor"), new Producto("Sofa")};
```

## Recorrer array con for

```Java
String[] nombres = {"Andres", "Ana", "Agustin"};

for(int i = 0; i < nombres.length; i++) {
    System.out.println("nombre = "+nombres[i]);
        }
```


## Recorrer array con for each

```Java
String[] nombres = {"Andres", "Ana", "Agustin"};

for(String nombre: nombres) {
    System.out.println("nombre = " + nombre);
        }
```

---


# :star: SECCION 13 - MATRICES

## ¿Qué son las matrices?

- Son arreglos bidimensionales, donde cada uno de sus elementos es a su vez un arreglo en su segunda dimensión.

- Esto permite que no todos los elementos tengan el mismo tamalo.

- De esta forma es posible crer matrices recursivas y multi-dimensionales.

- Comienzan en el índice 0, tanto para la fila como para la columna

-> Para **declararla**:
```
int[fila][columna] matriz;
```

Cuando se crea una matriz, se utiliza el operador new, más el tipo de los elementos, más el número de filas y columnas. Ejemplo:

```Java
int[][] numeros = new int[2][3];
```

Se suelen denominar el **plural**

- Como en los arrays, se puede obtener el tamaño de la matri con el atributo **length**, tanto para filas y columnas:

```Java
int[][] numeros = new int[2][3];
System.out.println("número de filas: " + numeros.length);
System.out.println("número de columna: " + numeros[0].length);
```

- Además de **tipos primitivos** puede almacenar del tipo de referencia, objetos. Ejemplo:

```Java
Producto[][] productos = new Producto[2]][3];
String[][] nombres = new String[3]][5];
```

### Inicialiación de elementos
- Asignamos elementos a la matriz indicando la llave o índice de la fila y de la columna
```Java
int [][] numeros = new int[2][4];
numeros[0][0] = 1; 
numeros[0][1] = 2; 
numeros[0][2] = 3; 
numeros[0][3] = 4; 
numeros[1][0] = 5; 
numeros[1][1] = 6; 
numeros[1][2] = 7; 
numeros[1][3] = 8; 
```

```
1 2 3 4
5 6 7 8 
```

Ejemplo para matriz de objetos de tipo Producto:
```Java
Producto[][] productos = new Producto[2][2];

productos[0][0] = new Producto["Mesa comedor"];
productos[0][1] = new Producto["TV Sony LED 55"];
productos[1][0] = new Producto["Bicicleta Oxford"];
productos[1][1] = new Producto["Bicicleta Estática Gimnasio"];
```


```
Mesa comedor        TV Sony LED 55
Bicicleta Oxford  Bicicleta Estática Gimnasio
```

### Obtener elementos

- Accedemos a los elementos de la matriz mediante índice o llaves(keys) de la fila y columna

```Java
Producto tvSony = productos[0][1];
```

### Declaración, instanciación e inicialización de una matriz

- Se utiliza cuando conocemos los elementos y el tamaño de la matriz

```Java
int[][] numeros = { {1,2,3,4} , {5,6,7,8} };
```

### Recorrer una matriz usando for

```Java
// declaro
String[][] nombres = new String[3][2];
// asigno valores
nombres[0][0] = "Pepe";
nombres[0][1] = "María";

nombres[1][0] = "Pato";
nombres[1][1] = "Bea";

nombres[2][0] = "Lucas";
nombres[2][1] = "Luci";

// la recorro
for(int i = 0; i <nombres.length; i++) { // fila
    for(int j = 0; i <nombres[i].length; j++) { // columna
        System.out.printls("nombre = " + nombres[i][j]);
    }
}
```
---

# :star: SECCION 14 - POO : CLASES Y OBJETOS


- Los **objetos** como concepto, fuera de la informática, existen desde siempre, antes de la programación!

- El paradigma de la POO es tomar un objeto de la vida real y llevarlo a la programación.

Los **OBJETOS** son **entidades** que combinan...

... el **estado**(las **properties**, los atributos, las características)

... el **comportamiento** (los métodos, c{omo se relacionan unos con otros).

-> Una **clase** es un **molde**. Primero definimos un diseño (MOLDE) de cómo va a ser la entidad que queremos crear! De la **clase prototipo** se crean **instancias**, los objetos.

```Java
public class Automovil { // Declaracion de la clase -class es la palabra clave
    // Properties(atributos) es el estado
    String modelo;
    String color;
    double cilindrada;
    
    // Metodos
   public void acelerar() {}
   public void frenar() {}
    
}
```

- La clase se declara como UpperCamelCase-

- También se puede representar en un UML:


```
----------------------
      Automovil
----------------------
-modelo: String
-color: String
-cilindrada: double
----------------------
+acelerar(); void
+frenar(): void
```

## Crear objetos

- El operador **new** reserva memoria dinámica para un objeto. Se asigna una referencia hacia ese objeto.

```Java
Automovil auto = new Automovil();
```

---

# :star: SECCION 15 - POO: PAQUETES

## ¿Qué son los paquetes ?

Son como un contenedor que nos permite agrupar y organizar nuestras clases!

## Características:

- Agrupan y organizan nuestras clases.

- Además evitan conflictos de nombre entre clases.

- Según modificadores ocultan el acceso a sus clases y/o a sus miembros.

## Estándar en nombres de paquetes

- Deben estar escrito completamente en minúscula y los subpackage se separan con un punto.

- Típicamente las empresas utilizan la extensión de su dominio (com, org, es, cl, mx) seguido del nombdre dle dominio, ejemplo: com.google, com.fabebook. Si hay más de un proyecto de agrupan:
```
com.aguzman.proyectoa
com.guzman.proyectob
```

Y dentro de cada proyecto puedo tener sub paquetes

```
com.aguzman.compras.proyectoa
com.guzman.ventas.proyectoa
```

## Definiendo el package en nuestra clase

- Utilizamos la palabra reservada **package** seguido del nombre del paquete:

```Java
package com.aguzman.datos;

public class Persona {
}
```

- Luego para utilizar la clase la debemos importar con **import**

```Java
import com.aguzman.datos.Persona;
```

- Utilizando una clase:

```Java
package com.aguzman.prueba;

public class TestMain {
    public static void main(String[] args) {
        com.aguzman.datos.Persona persona = new com.aguzman.datos.Persona();
    }
}
```

- Importando para utilizar una clase:

```Java
package com.aguzman.prueba;

import com.aguzman.datos.Persona;

public class TestMain {
    public static void main(String[] args) {
       Persona persona = new Persona();
    }
}
```

- Importando TODAS las clase:

```Java
package com.aguzman.prueba;

import com.aguzman.datos*;

public class TestMain {
    public static void main(String[] args) {
       Persona persona = new Persona();
    }
}
```

- Evitando conflictos de nombre:

```Java
package com.aguzman.prueba;

import com.aguzman.datos.Persona;

public class TestMain {
    public static void main(String[] args) {
       Persona persona = new Persona();
       com.aguzman.otro.Persona persona2 = new com.aguzman.otro.Persona();
    }
}
```

- Import estático:

```Java
package com.aguzman.prueba;

import com.aguzman.datos.Persona.saludar;

public class TestMain {
    public static void main(String[] args) {
       String saludo = saludar();
    }
}
```

### Modificadores de acceso

- **PUBLIC** -> Todos tienen acceso

- **DEFAULT** -> Solo acceden los del mismo paquete

- **PROTECTED** -> Acceden las clases del mismo paquete y las clases hijas

- **PRIVATE** -> Solo se accede en la misma clase (no influye el paquete o la herencia)

---

# :star: SECCIÓN 16 - POO - EJEMPLO FACTURA

## UML de las clases

```
                        -----------------------
                           Factura
---------------         ---------------------
    Cliente             -cliente: Cliente
--------------- <----   -items: itemFactura[]
-nombre: String         -folio: Integer
-nif: String            -descripcion: String
----------------        -fecha: Date
                        ------------------------
                         +calcularTotal(): Double
                         +verDatalle(): String
                         ---------------------
                               |
                        ---------------------------
                            ItemFactura
                        ---------------------------        -----------------------
                        -producto: Producto         ----->       Producto
                        -cantidad: Integer                 -----------------------
                        ---------------------------         -codigo: Integer
                        +calcularImporte(): Double          -nombre: String
                        ---------------------------         -precio: Double
                                                          -----------------------
```                      


---

## :star: SECCIÓN 17 - POO - SOBRECARGA DE MÉTODOS

## ¿Qué es la sobrecarga?

- La sobrecarga se refiere a la posibilidad de tener dos o más métodos con el mismo nombre pero con funcionalidad diferente. Los argumentos deben ser distintos, puede variar la cantidad o el tipo de dato.

---

# :star: SECCIÓN 18 - POO - HERENCIA

## ¿Qué es la herencia?

Es una relación de parentesco entre dos clases, una es padre de la otra (que es la hija)

## Características

- Es el mecanismo de la POO para implementar relaciones de jerarquía de clases

- Una subclase hereda el estado(propiedades) y el comportamiento(sus métodos) de todos sus ansestros

- Es una de las bases de **reutilización de código** y **polimirfismo**.

- También es un principio fundamental de la POO

## Parentesco entre clases

No puede existir herencia si no existe alguna relación familiar entre ambas!

## Ejemplo de herencia

````Java
class Persona{}
classProfesor extends Persona {}
class Director extends Persona{}
class Alumno extends Persona{}
class Alumnointernacional extends Alumno {}
```

- El término **superclase** se refiere a la clase que es el **ancestro más directo**, así como a todas las clases ascendentes.

- **extends** es la palabra reservada

- Cuando una clae no extiende de manera explícita, lo hace de la **clase Object**, la clase padre de todas las clases en Java

- En UML es una **flecha continua** que va desde la clase hija hasta la clase padre, similar a la relación de asociación, pero con la diferencia que termina con una punta en forma de triángulo.

## Hay dos formas de herencia

Hay dos formas distintas para el proceso de creación de jerarquías de clases o herencia:

- Generalización: teneemos dos clases hijas de Persona: Profesor y Alumno

- Especialización: la clase padre Persona y la clase hija Alumno.

## Constructor y la palabra reservada super

```Java
public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

public class Alumno extends Persona {
private double promedio;

public Alumno(String nombre, String apellido, double promedio) {
    super(nombre, apellido);
    this.promedio = promedio;
}
```

## Sobreescritura de métodos

- Se puede sobreescribir un  método que heredamos del padre, se puede hacer redefiniendo en la clase hija un método con el mismo nombre.

-> **polimorfismo**: distintas formas para un mismo comportamiento.

- @Override para indicar que sobreescribimos

```Java
public class Alumno extends Persona {
    @Override
    public void metodoDelPadre {
        super.metodoDelPadre();
        // aca sigo con lo particular de Alumno
    }
}
```

## Sobreescritura de toString

- También con @Override

- En el return primero invoco a: **super.toString()**  y luego agrego lo particular de la clase.

## REstringir la herencia y sobreescritura de métodos

- Para impedir la herencia usamos la palabra **final**, la clase que tenga final no puede tener clases hijas(no tiene herencia). Lo mismo con los métodos, si un método en la clase padre tiene final no puede ser modificado en las clases hijas.

---
