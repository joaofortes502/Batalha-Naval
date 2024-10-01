import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Tabuleiro tabuleiro1 = new Tabuleiro();
        Tabuleiro tabuleiro2 = new Tabuleiro();
        Modo modoDeJogo = new Modo();
        int vez = 1;
        String pos;
        int avaliableShips = 10;

        int tipoJogo = modoDeJogo.definirModoDeJogo();

        if (tipoJogo==0){
            //jogador contra jogador

            //seleção dos barcos --> Manual ou Automatica?
            int selececao = modoDeJogo.definirModoDeSelecao();
            if(selececao==1){
                //necessita um metodo que define os parametros de adiconar navio vulgo { pos, tam, sentido }
                while (avaliableShips!=0){
                    System.out.print("Informe a posição do barco");
                    pos = ler.next();
                }
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