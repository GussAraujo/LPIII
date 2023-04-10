import random
import time

dados = []
ponto = 0; lacamento = 0;

print("Jogo do CRAPS!!!")
print("Aperte ENTER para jogar os 2 dados...")
time.time()

dados.append(int(random.randint(0, 6)))
dados.append(int(random.randint(0, 6)))

ponto = dados[0] + dados[1]

print(f"Valor dos dados: {dados[0]} e {dados[1]}")
print(f"Ponto: {ponto}")

if ponto == 7 or ponto == 11:
    print("Voce venceu!!")
elif ponto == 2 or ponto == 3 or ponto == 12:
    print("Voce perdeu!!!")
else:
    print("Iniciando segundo estagio...")
    lacamento += 1

while (lacamento != 0):
    dados.clear()

    dados.append(int(random.randint(0, 6)))
    dados.append(int(random.randint(0, 6)))

    print(f"Valor dos dados: {dados[0]} e {dados[1]}")
    jogada = dados[0] + dados[1]

    print(f"Jogada {lacamento}: {jogada}")
    lacamento += 1

    if jogada == ponto:
        print("Voce venceu!!!")
        break