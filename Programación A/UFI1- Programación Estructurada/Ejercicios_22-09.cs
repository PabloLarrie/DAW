using System;
using System.Collections.Generic;
using System.Linq;

namespace UFI1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // SUMA PRIMEROS 10 NÚMEROS NATURALES //

            // Mi propuesta //
            
            
            int resultado = 0;
            int[] numerosNaturales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            foreach (var numero in numerosNaturales)
            {
                resultado += numero;
            }

            Console.WriteLine(resultado);


            // Lo que supongo que se pedía //

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            int f = 6;
            int g = 7;
            int h = 8;
            int i = 9;
            int j = 10;

            Console.WriteLine(a + b + c + d + e + f + g + h + i + j);


            // Propuesta más "sencilla" (Atención, para utilizar el métido Sum hay que importar System.Linq) //

            int[] numerosNaturales2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Console.WriteLine(numerosNaturales2.Sum());


            // CALCULA LA SUMA DE LOS INPUTS //

            // Mi propuesta //

            List<int> listaNumeros = new List<int>();
            Console.WriteLine("Indique el núnero de dígitos que quiere verificar:");
            int indice = Convert.ToInt32(Console.ReadLine());
            // int indice = 10;

            while (listaNumeros.Count < indice)
            {
                Console.WriteLine($"Introduce el dato {listaNumeros.Count + 1}/{indice}:");
                Int32 numParaAñadir = (Convert.ToInt32(Console.ReadLine()));
                listaNumeros.Add(numParaAñadir);    
            }
            double total = listaNumeros.Sum();
            Console.WriteLine($"Su lista de {listaNumeros.Count} elementos tiene un valor de {total} y una media de " +
                              $"{total/indice}"); 
            
            // Lo que supongo que nos piden //

            Console.WriteLine($"Introduce el primer dato:");
            int indice1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el segundo dato:");
            int indice2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el tercer dato:");
            int indice3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el cuarto dato:");
            int indice4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el quinto dato:");
            int indice5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el sexto dato:");
            int indice6 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el séptimo dato:");
            int indice7 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el octavo dato:");
            int indice8 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el noveno dato:");
            int indice9 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el último dato:");
            int indice0 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(
                indice1 +
                indice2 +
                indice3 +
                indice4 +
                indice5 +
                indice6 +
                indice7 +
                indice8 +
                indice9 +
                indice0
                );
            Console.WriteLine("La medida es 10"); 
            
            
            // MUESTRA NÚMEROS IMPARES 1-99 //
            
            // Mi propuesta //

            for (int impar = 1; impar <= 99; impar += 2)
            {
                Console.WriteLine(impar);
            }
            
            // OPERA DOS INPUTS //
            
            // Mi propuesta //
            
            Console.WriteLine($"Introduce el primer número");
            int n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el segundo número");
            int n2 = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine($"El resultado de {n1} + {n2} es: {n1 + n2}");
            Console.WriteLine($"El resultado de {n1} - {n2} es: {n1 - n2}");
            Console.WriteLine($"El resultado de {n1} * {n2} es: {n1 * n2}");
            Console.WriteLine($"El resultado de {n1} / {n2} es: {n1 / n2}"); 
            
        }
        
    }
}