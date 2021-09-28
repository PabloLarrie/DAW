import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int num1, num2, opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        do {
            System.out.println("----- Boletín de Ejercicios UFC EJ1 -----");
            System.out.println("-----        MENÚ DE OPCIONES       -----");
            System.out.println("Elige una opción");
            System.out.println(" 1. Par/ impar ");
            System.out.println(" 2. Suma ");
            System.out.println(" 3. Resta ");
            System.out.println(" 4. Multiplicación ");
            System.out.println(" 5. División ");
            System.out.println(" 6. Números hasta " + num1);
            System.out.println(" 7. Números desde " + num2+ " hasta 0");
            System.out.println(" 0. Salir ");
            System.out.println("   - Elige una opción:");
            opcion = sc.nextInt();
            System.out.println();
            System.out.println("************************************");
            switch (opcion) {
                case 1: {
                    System.out.println("Son pares o impares: " + num1 + " y " + num2);
                    esPar(num1);
                    break;
                }
                case 2: {
                    System.out.println("Operaciones aritméticas con: " + num1 + " y " + num2);
                    System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                }
                case 3: {
                    System.out.println("Operaciones aritméticas con: " + num1 + " y " + num2);
                    System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                }
                case 4: {
                    System.out.println("Operaciones aritméticas con: " + num1 + " y " + num2);
                    System.out.println("El resultado de la multiplicación es " + (num1 * num2));
                    break;
                }
                case 5: {
                    System.out.println("Operaciones aritméticas con: " + num1 + " y " + num2);
                    System.out.println("El resultado de la división es " + (num1 / num2));
                    break;
                }
                case 6: {
                    System.out.println("Contar números desde 0 a  " + num1);
                    System.out.println("Los números son: ");
                    for (int i = 0; i <= num1; i++) {
                        System.out.print(i + "; ");
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.println("Contar números atrás desde" + num2+"a 0");
                    System.out.println("Los números son: ");
                    while (num2>0) {
                        System.out.print(num2-- +"; ");
                    }
                    System.out.println();
                    break;
                }
                case 0: {
                    System.out.println("Gracias por usar esta mierda...");
                    break;
                }
                default:
                    System.out.println("Opción incorrecta, inténtalo de nuevo...");
            }
            System.out.println("************************************");
            System.out.println();
        } while (opcion != 0);
        System.out.println("____Fin del pograma____");
    }


    public static void esPar (int numero) {
        if (numero%2==0) {
            System.out.println("El número " +numero+" es par.");
            }
        else {
            System.out.println("El número " +numero+" es impar.");
        }
    }
}
