from Tabuleiro import Tabuleiro
from Jogador import Jogador

class BatalhaNaval:
    
    def __init__(self):
        print("Welcome to Battleship!")

        print("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.")
        tabuleiro1 = Tabuleiro(5, 5)
        tabuleiro1.posicionarNavios()

        print("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.")
        tabuleiro2 = Tabuleiro(5, 5)
        tabuleiro2.posicionarNavios()

        jogador1 = Jogador("PLAYER 1", tabuleiro2)
        jogador2 = Jogador("PLAYER 2", tabuleiro1)

        jogadorAtual = jogador1

        while True:
            print(f"{jogadorAtual.getNome()}, enter hit row/column:")
            jogadorAtual.jogar()

            if jogadorAtual.perdeu():
                if jogadorAtual == jogador1:
                    jogadorAtual = jogador2
                else:
                    jogadorAtual = jogador1

                print("")
                print(f"{jogadorAtual.getNome()} WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!")
                print("Final boards:")

                jogador1.exibirTab()
                jogador2.exibirTab()

                break
            
            if jogadorAtual == jogador1:
                jogadorAtual = jogador2
            else:
                jogadorAtual = jogador1

BatalhaNaval()