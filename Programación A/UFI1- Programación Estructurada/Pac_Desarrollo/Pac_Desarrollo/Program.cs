using System;

namespace Pac_Desarrollo
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            String frase_Pac;
            int total_Letras_Frase_Pac;
            int total_Vocales_Frase_Pac;
            String vocales_Frase_Pac;
            List<char> vocales = new List<char>('a', 'e', 'i', 'o', 'u')
            
            frase_Pac = "ilerna online programacion 2021";
            total_Letras_Frase_Pac = frase_Pac.Length;
            total_Vocales_Frase_Pac = 0;
            vocales_Frase_Pac = "";

            foreach (var letra in frase_Pac)
            {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                {
                    total_Vocales_Frase_Pac += 1;
                    vocales_Frase_Pac += letra;
                }
            }
            
            Console.WriteLine("Número de letras en nuestra variable: " + total_Letras_Frase_Pac);
            Console.WriteLine("En nuestra variable hay " + total_Vocales_Frase_Pac + " vocales.");
            Console.WriteLine("Nuestra variable en mayúsculas es : " + frase_Pac.ToUpper());
            Console.WriteLine("Vocales en nuestra variable: " + vocales_Frase_Pac);


        }
    }
}