class Tabuleiro:
    
    def __init__(self, tamanho, numNavios):
        self.tamanho = tamanho
        self.numNavios = numNavios
        self.tabuleiro = [['-','-','-','-','-'],
                          ['-','-','-','-','-'],
                          ['-','-','-','-','-'],
                          ['-','-','-','-','-'],
                          ['-','-','-','-','-'],]

    def posicionarNavios(self):
        for i in range(0, self.tamanho):
            print(f"Enter ship {(i + 1)} location:")

            while True:
                linha = int(input())
                coluna = int(input())

                if self.__posicionarNavio(linha, coluna):
                    break
        
        self.exibir(True)

    def __posicionarNavio(self, linha, coluna):
        if linha > 4 or coluna > 4 or linha < 0 or coluna < 0:
            print("Invalid coordinates. Choose different coordinates.")
            return False
        elif self.tabuleiro[linha][coluna] == '@':
            print("Invalid coordinates. Choose different coordinates.")
            return False
        
        self.tabuleiro[linha][coluna] = '@'
        return True;

    def atirar(self, linha, coluna, nome):
        if linha > 4 or coluna > 4 or linha < 0 or coluna < 0:
            print("Invalid coordinates. Choose different coordinates.")
            return False
        elif self.tabuleiro[linha][coluna] == '@':
            self.tabuleiro[linha][coluna] = 'X'
            print(f"{nome} HIT SHIP!")
            return True
        else:
            self.tabuleiro[linha][coluna] = 'O'
            print(f"{nome} MISSED!")
            return True
        
    def perdeu(self):
        for i in range(0, self.tamanho):
            for j in range(0, self.tamanho):
                if self.tabuleiro[i][j] == '@':
                    return False
        return True

    def exibir(self, mostrarNavios):
        print("  0 1 2 3 4")
        for i in range(0, self.tamanho):
            print(f"{i} ", end="")
            for j in range(0, self.tamanho):
                if not mostrarNavios and self.tabuleiro[i][j] == '@':
                    print("- ", end="")
                else: 
                    print(f"{self.tabuleiro[i][j]} ", end="")
            print()
        print()