import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();


    public String[][] tabuleiro1 = new String[11][11];
    public String[][] tabuleiro2 = new String[11][11];

    public static void exibirTabuleiro(String[][] tabuleiro){
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                System.out.print(tabuleiro[i][j] + ' ');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

    }
}