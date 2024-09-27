import java.util.Scanner;

public class Modo {
    Scanner ler = new Scanner(System.in);
    int retorno;


    /*
        Retorna 0 para jogador e 1 para computador
        @param void
        @return int
     */
    public int definirModoDeJogo(){

        do{
            System.out.print("Digite 0 para jogar contra outro jogador e 1 para jogar contra o computador: ");
            retorno = ler.nextInt();
        }while(retorno!=0 && retorno!=1);

        return retorno;
    }
}
