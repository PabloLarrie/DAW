using System;
using System.Collections.Generic;
using System.Linq;

namespace UFI1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            List<int> lista_numeros = new List<int>();
            Console.WriteLine("Indique el núnero de dígitos que quiere verificar:");
            // int indice = Convert.ToInt32(Console.ReadLine());
            int indice = 10;

            while (lista_numeros.Count < indice)
            {
                Console.WriteLine($"Introduce el dato {lista_numeros.Count + 1}/{indice}:");
                Int32 number_to_add = (Convert.ToInt32(Console.ReadLine()));
                lista_numeros.Add(number_to_add);
            }
            double total = lista_numeros.Sum();
            Console.WriteLine($"Su lista contiene {lista_numeros.Count} elementos, y su valor es de {total}");
            
            /*
            // SUMA PRIMEROS 10 NÚMEROS NATURALES //

            // Mi propuesta //

            int resultado = 0;
            int[] numeros_naturales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            foreach (var numero in numeros_naturales)
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

            int[] numeros_naturales2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            double total = numeros_naturales2.Sum();
            Console.WriteLine(total);

        

            // SUMA PRIMEROS 10 NÚMEROS NATURALES //

            // Mi propuesta //

            List<string> lista_numeros = new List<string>();
            Console.WriteLine("Indique el núnero de dígitos que quiere verificar:");
            int indice = Convert.ToInt32(Console.ReadLine());
            while (lista_numeros.Count < indice)
            {
                Console.WriteLine($"Introduce el dato {lista_numeros.Count + 1}/{indice}");
                lista_numeros.Add(Console.ReadLine());
            }

            Console.WriteLine($"Su lista contiene {lista_numeros.Count}, y su valor total es de {lista_numeros}");
            Console.WriteLine("Hola tonto");


            // Lo que supongo que nos piden //

            int indice1 = Convert.ToInt32(Console.ReadLine());
            int indice2 = Convert.ToInt32(Console.ReadLine());
            int indice3 = Convert.ToInt32(Console.ReadLine());
            int indice4 = Convert.ToInt32(Console.ReadLine());
            int indice5 = Convert.ToInt32(Console.ReadLine());
            int indice6 = Convert.ToInt32(Console.ReadLine());
            int indice7 = Convert.ToInt32(Console.ReadLine());
            int indice8 = Convert.ToInt32(Console.ReadLine());
            int indice9 = Convert.ToInt32(Console.ReadLine());
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
            int n_1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Introduce el segundo número");
            int n_2 = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine($"suma {n_1 + n_2}");
            Console.WriteLine($"resta {n_1 - n_2}");
            Console.WriteLine($"multiplicación {n_1 * n_2}");
            Console.WriteLine($"división {n_1 / n_2}"); */
        }
        
    }
}