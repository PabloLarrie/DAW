# SUMA PRIMEROS 10 NÚMEROS NATURALES

# Opción 1

a = 1
b = 2
c = 3
d = 4
e = 5
f = 6
g = 7
h = 8
i = 9
j = 10

print(a + b + c + d + e + f + g + h + i + j)

# Opción 2

numerosNaturales = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
resultado = 0

for v in numerosNaturales:
	resultado += v

print(resultado)

# CALCULA LA SUMA DE LOS INPUTS DE UN USUARIO

# Opción 1

a1 = int(input(f"Introduce el número 1/10: "))
a2 = int(input(f"Introduce el número 2/10: "))
a3 = int(input(f"Introduce el número 3/10: "))
a4 = int(input(f"Introduce el número 4/10: "))
a5 = int(input(f"Introduce el número 5/10: "))
a6 = int(input(f"Introduce el número 6/10: "))
a7 = int(input(f"Introduce el número 7/10: "))
a8 = int(input(f"Introduce el número 8/10: "))
a9 = int(input(f"Introduce el número 9/10: "))
a0 = int(input(f"Introduce el número 10/10: "))

total = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a0
media = total / 10
print(f"El resultado es {total}, y la media es {media}")

# Opción 2

numerosUsuario = 0
for v in range(10):
	numerosUsuario += int(input(f"Introduce el número {v}/10: "))

print(f"Su lista de 10 números suman: {numerosUsuario}, y tienen una media  de {numerosUsuario / 10}")

# Números impares del 1 al 99

for i in range(1, 100, 2):  # Empieza en 1, termina en 100, y avanza de 2 en 2
	print(i)

# Opera dos user inputs

input1 = int(input("Introduce el primer input: "))
input2 = int(input("Introduce el segundo input: "))

print(f"El resultado de sumar {input1} y {input2} es {input1 + input2}")
print(f"El resultado de restar {input1} y {input2} es {input1 - input2}")
print(f"El resultado de multiplicar {input1} y {input2} es {input1 * input2}")
print(f"El resultado de dividir {input1} y {input2} es {input1 / input2}")
