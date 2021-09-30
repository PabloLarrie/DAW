import java.util.Scanner;

import static java.lang.Math.pow;

public class UF1 {
    private int lado1, lado2, lado3;

    public void inicializar() {
        System.out.println("Introduce las medidas de los lados del triángulo que quieres crear.");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Medida lado 1: ");
        lado1 = teclado.nextInt();
        System.out.print("Medida lado 2: ");
        lado2 = teclado.nextInt();
        System.out.print("Medida lado 3: ");
        lado3 = teclado.nextInt();
    }

    public void ladoMayor() {
        System.out.print("- El lado mayor mide: ");
        if (lado1>lado2 && lado1>lado3) {
            System.out.println(lado1);
        } else {
            System.out.println(Math.max(lado2, lado3));
        }
    }

    public void esEquilatero() {
        if (lado1==lado2 && lado1==lado3) {
            System.out.print("- Es un triángulo equilátero.");
        } else {
            System.out.print("- No es un triángulo equilátero.");
        }
    }

    public static void main (String[] args) {

/* 2. Crea un programa que pida al usuario que introduzca su nombre y devuelva el mensaje
“Bienvenido al curso de M03B” seguido del nombre del alumno. */

        System.out.println("Introduzca su nombre: ");
        System.out.println("Bienvenido al curso de M03B, " + new Scanner(System.in).nextLine() + "\n");


/* 3. A partir de los datos del valor del radio introducido por teclado, crea un programa que
calcule el área del círculo resultante. Para ello recuerda que la fórmula para calcular el
área de un círculo es el producto de la CONSTANTE PI por el valor del radio al
cuadrado. Puedes usar la librería Math y la función pow () para calcular la potencia. */

        System.out.println("Introduzca el radio del círuclo: ");
        System.out.println("El area de su círculo es " + Math.PI*pow(new Scanner(System.in).nextDouble(),2) + "\n");


/* 4. Escribe un programa que pida al usuario un número cualquiera mayor que cero y
calcule el número de dígitos que lo forman. El programa se reiniciará hasta que el
usuario introduzca el valor 0, lo que hará que el éste finalice su ejecución.*/

        int numero;
         do {
            System.out.println("Introduzca un número mayor que 0: ");
            numero = new Scanner(System.in).nextInt();
            System.out.println("El número " + numero + " tiene " + Integer.toString(numero).length() + " dígitos" + "\n");
        } while (numero>0);
        System.out.println("El programa ha finalizado con éxito." + "\n");


/* 5. Escribe un programa que pida al usuario introducir números por teclado para obtener
la media de todos los números introducidos. Cuando se inserte un cero, el programa
dejará de pedir números y usará los que haya introducido antes para calcular la media
aritmética.*/

        double resultado = 0;
        int dato;
        int vueltas = 0;
        do {
            System.out.println("Introduzca un número (0 para terminar): ");
            dato = new Scanner(System.in).nextInt();
            resultado += dato;
            vueltas++;
        } while (dato>0);
        System.out.println("La media de sus números es " + resultado / vueltas +"\n");


/*Crea un programa en Java que a partir de la clase Triángulo, tenga como atributos los
lados del mismo y como métodos pueda mostrar el valor del lado más grande y que
pueda indicar si el triángulo es equilátero o no.*/

        UF1 triangulo1=new UF1();
        triangulo1.inicializar();
        triangulo1.ladoMayor();
        triangulo1.esEquilatero();


    }
}
