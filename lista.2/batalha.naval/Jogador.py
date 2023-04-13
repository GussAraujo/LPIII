from Tabuleiro import Tabuleiro

class Jogador:
    
    def __init__(self, nome, tabuleiro):
        self.nome = nome
        self.tabuleiro = tabuleiro
    
    def getNome(self):
        return self.nome
    
    def jogar(self):
        self.tabuleiro.exibir(False)

        print(f"{self.getNome()}, enter hit row/column: ", end="")

        while True:
            linha = int(input())
            coluna = int(input())
            if self.tabuleiro.atirar(linha, coluna, self.nome):
                break

        self.tabuleiro.exibir(False)
    
    def perdeu(self):
        return self.tabuleiro.perdeu()
    
    def exibirTab(self):
        self.tabuleiro.exibir(True)
