n = 10; media = 0; desvioPadrao = 0
voltagens = []

for i in range(0, 10):
    voltagens.append(float(input(f"Digite a voltagem {i+1}:")))
    media += voltagens[i]

media /= n

for i in range(0, 10):
    desvioPadrao += (voltagens[i] - media) ** 2

desvioPadrao = (desvioPadrao/n) ** 0.5

print(f"Media: {media}")
print(f"Desvio padrão: {desvioPadrao}")