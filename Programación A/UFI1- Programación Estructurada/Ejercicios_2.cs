using System;
using System.Collections.Generic;
using System.Linq;

namespace UFI1
{
    internal class Program2
    {
        public static void Main2(string[] args)
        {
            
            // SUMA PRIMEROS 10 NÚMEROS NATURALES //

            // Mi propuesta //

            // List<string> lista_numeros = new List<string>(); 
            int[] lista_numeros = new int[] {};
            Console.WriteLine("Indique el núnero de dígitos que quiere verificar:");
            int indice = Convert.ToInt32(Console.ReadLine());
            while (lista_numeros.Length < indice)
            {
                Console.WriteLine($"Introduce el dato {lista_numeros.Length + 1}/{indice}");
                lista_numeros.Append(Console.Read());
            }

            Console.WriteLine($"Su lista contiene {lista_numeros.Length}, y su valor total es de {lista_numeros}");


           
        }
        
    }
}