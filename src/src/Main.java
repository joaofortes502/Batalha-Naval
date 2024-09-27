public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = new Tabuleiro();
        Tabuleiro tabuleiro2 = new Tabuleiro();
        Modo modoDeJogo = new Modo();
        int vez = 1;

        int tipoJogo = modoDeJogo.definirModoDeJogo();

        if (tipoJogo==0){
            //jogador contra jogador

            //seleção dos barcos --> Manual ou Automatica?
            int selececao = modoDeJogo.definirModoDeSelecao();
            if(selececao==1){
                //manual
            }else{
                //automática
            }


            //inicia jogo
            //ataca -> verifica situacao -> ataca -> verifica situacao

        }else{
            //jogador contra computador

            //seleção dos barcos --> Manual ou Automatica?

            //Manual{
            //}else Automatica{
            //}

            //inica jogo
            //ataca -> verifica situacao -> ataca -> verifica situacao

        }


        //tabuleiro1.printarTabuleiro();
        final RetornoHandler resposta = tabuleiro1.adicionarNavio("B7", 5, false);
        if (!resposta.isSucesso()) {
            System.out.print(resposta.getErro());
        } else {
            tabuleiro1.printarTabuleiro();
        }
    }


}