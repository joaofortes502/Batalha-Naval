public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro();
        Modo modoDeJogo = new Modo();


        int tipoJogo = modoDeJogo.definirModoDeJogo();

        //tabuleiro1.printarTabuleiro();
        final RetornoHandler resposta = tabuleiro1.adicionarNavio("B7", 5, false);
        if (!resposta.isSucesso()) {
            System.out.print(resposta.getErro());
        } else {
            tabuleiro1.printarTabuleiro();
        }
    }


}