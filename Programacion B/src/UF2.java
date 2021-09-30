import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class UF2 {
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;

    public void cargar() {
        teclado = new Scanner(System.in);
        nombres = new String[5];
        sueldos = new float[5];
        for (int f=0; f<nombres.length; f++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombres[f] = teclado.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[f] = teclado.nextFloat();
        }
    }
    public void mayorSueldo() {
        float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
        System.out.println("Tiene un sueldo de :"+mayor);
    }

    public static void main (String[] args) {

/* 1 .Escribe un programa que pida una cadena de texto
al usuario e indique cuántas vocales tiene.*/

/*        int contador = 0;
        String quote = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una frase:");

        for(int i=0;i<quote.length();i++) {
            if ((quote.charAt(i) == 'a')
                || (quote.charAt(i) == 'e')
                || (quote.charAt(i) == 'i')
                || (quote.charAt(i) == 'o')
                || (quote.charAt(i) == 'u')) {
                    contador++;
            }
        }
        JOptionPane.showMessageDialog(
                new JFrame(),
                "Su frase " + "'" + quote + "'" + "contiene: " + contador + " vocales.",
                "Tonto",
                JOptionPane.INFORMATION_MESSAGE
        );*/



/* 2. Escribe un programa que pida una cadena de texto al usuario y muestre por consola
dicha cadena de forma invertida*/
/*
        String texto = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una frase:");
        JOptionPane.showMessageDialog(new JFrame(), new StringBuilder(texto).reverse().toString());*/




/* 3. Escribe un programa que pida una cadena de texto al usuario y a continuación, pida al
usuario un carácter cualquiera. A continuación, el programa determinará el número de
apariciones que tiene dicho carácter en la cadena introducida.*/

/*        int texto2 = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una frase:");
        int n = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una número:");*/

        /*String letra;
        int contador = 0;
        String frase = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una frase:");
        do {
            letra = JOptionPane.showInputDialog(new JFrame(),"Hola, escribe una sola letra:");
        } while(letra.length() != 1);

        for(int i=0; i<frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Su frase contiene su letra " +contador+ " veces.");*/


/*        int ans = Integer.parseInt(JOptionPane.showInputDialog(new JFrame(), "Número: "));
    JOptionPane.showMessageDialog(new JFrame(), ans);*/



//  4. Crea un programa que muestre el contenido del directorio C:/ de tu disco duro


/*        String[] lista = new File("/home/pablo").list();

        for (int i = 0; i < Objects.requireNonNull(lista).length; i++) {
            System.out.println(lista[i]);
        }*/

/*   5. Crea un programa que permita cargar en un array los nombres de 5 operarios y en otro
    sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario
        */

        UF2 pv = new UF2();
        pv.cargar();
        pv.mayorSueldo();


    }
}
