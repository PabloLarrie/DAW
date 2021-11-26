import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario miUsuario = new Usuario();
        Cuenta miCuenta = new Cuenta();
        String nombre;
        String dni;
        String description;
        int instruccion;
        int edad;
        double gasto;
        double ingreso;
        boolean flag = false;

        System.out.println("Introduzca el nombre del usuario: ");
        nombre = new Scanner(System.in).nextLine();
        do {
            try {
                System.out.println("Introduzca la edad del usuario: ");
                edad = new Scanner(System.in).nextInt();
                if (edad > 0 && edad <= 118) {
                    flag = true;
                }
                else{
                    System.out.println("Esa edad es imposible.");
                }
            }catch (InputMismatchException exception){
                System.out.println("Has introducido una edad incorrecta.");
                edad = 0;
            }
        }while (!flag);

        flag = false;
        System.out.println("Introduzca el DNI del usuario: ");
        dni = new Scanner(System.in).nextLine();

        miUsuario.setNombre(nombre);
        miUsuario.setEdad(edad);
        if (miUsuario.setDNI(dni)) {
            flag = true;
        } else {
            do {
                System.out.println("Has introducido un DNI incorrecto.");
                System.out.println("Por favor, introduzca vuelva a intentarlo: ");
                dni = new Scanner(System.in).nextLine();
                if (miUsuario.setDNI(dni)) {
                    flag = true;
                }
            } while (!flag);
        }

        miCuenta.setUsuario(miUsuario);
        miCuenta.setSaldo(miCuenta.getSaldo());
        System.out.println("Se ha creado el usuario correctamente.");
        System.out.println(miUsuario);
        System.out.println(miCuenta);

        do {
            flag = false;
            System.out.println("");
            System.out.println("--Realiza una nueva acción --");
            System.out.println("[1] Introduce un nuevo gasto.");
            System.out.println("[2] Introduce un nuevo ingreso.");
            System.out.println("[3] Mostrar gastos de " + miUsuario.getNombre() + ".");
            System.out.println("[4] Mostrar ingresos de " + miUsuario.getNombre() + ".");
            System.out.println("[5] Mostrar saldo de " + miUsuario.getNombre() + ".");
            System.out.println("[0] Salir.");

            try {
                instruccion = new Scanner(System.in).nextInt();
            }
            catch (InputMismatchException exception) {
                instruccion = 9;
            }

            switch (instruccion) {
                case 1:
                    try {
                        System.out.println("Introduce la descripción del gasto:");
                        description = new Scanner(System.in).nextLine();
                        System.out.println("Introduce la cantidad del gasto.");
                        gasto = new Scanner(System.in).nextDouble();
                        try {
                            miCuenta.addGastos(description, gasto);
                        } catch (GastoException exception) {
                            exception.printStackTrace();
                        }
                        System.out.println(miCuenta);
                        break;
                    } catch (InputMismatchException exception){
                        System.out.println("Has introducido un tipo de dato incorrecto.");
                        break;
                    }
                case 2:
                    try {
                        System.out.println("Introduce la descripción del ingreso:");
                        description = new Scanner(System.in).nextLine();
                        System.out.println("Introduce la cantidad del ingreso.");
                        ingreso = new Scanner(System.in).nextDouble();
                        miCuenta.addIngresos(description, ingreso);
                        System.out.println(miCuenta);
                        break;
                    } catch (InputMismatchException exception){
                        System.out.println("Has introducido un tipo de dato incorrecto.");
                        break;
                    }
                case 3:
                    for ( Gasto gastos : miCuenta.getGastos()) {
                        System.out.println(gastos);
                    }
                    break;
                case 4:
                    for ( Ingreso ingresos : miCuenta.getIngresos()) {
                        System.out.println(ingresos);
                    }
                    break;
                case 5:
                    System.out.println("El saldo de " + miUsuario.getNombre() + " es " + miCuenta.getSaldo() + "€.");
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    System.out.println("Gracias por utilizar la aplicación.");
                    flag = true;
                    break;
                default:
                    System.out.println("Esa no es una opción correcta.");
                    System.out.println("Por favor, inténtelo de nuevo.");
                    break;
            }
        } while (!flag);
    }
}
