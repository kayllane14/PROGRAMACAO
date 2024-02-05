from abc import ABC, abstractmethod


class Observador(ABC):
    @abstractmethod
    def notificarCampeao(self, vencedor):
        pass


class Continente(Observador):
    def __init__(self, nome):
        self.nome = nome

    def notificarCampeao(self, vencedor):
        print(f"Região {self.nome}: Jogador {vencedor} conquistou esta região!")


class JogoWar:
    def __init__(self):
        self.observadores = []

    def adicionarObservador(self, observador):
        self.observadores.append(observador)

    def removerObservador(self, observador):
        self.observadores.remove(observador)

    def notificarObservadores(self, vencedor):
        for observador in self.observadores:
            observador.notificarCampeao(vencedor)

    def jogadorVence(self, vencedor):
        print(f"Jogador {vencedor} venceu o jogo!")
        self.notificarObservadores(vencedor)

# Exemplo de uso
if __name__ == "__main__":
    regioes = [Continente("América do Norte"), Continente("Ásia")]

    jogo = JogoWar()

    for regiao in regioes:
        jogo.adicionarObservador(regiao)

 
    jogo.jogadorVence(1)