package jogo;

public class Guerreiro extends Personagem{
    public void atacar() {
        int valorDado6Face = this.rolarDado();
        System.out.printf("Você tirou um %d no dado.\n", valorDado6Face);
        if (valorDado6Face < 3) {
            System.out.println("O Guerreiro errou o ataque");
        } else if (valorDado6Face = 6) {
            System.out.println("O Guerreiro acertou o golpe especial.");
        }else{
            System.out.println("O Guerreiro acertou o inimigo!!");
        }
    }
}

