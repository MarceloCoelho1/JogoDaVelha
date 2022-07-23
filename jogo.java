package programa;
import java.util.Scanner;
import java.util.Random;

public class jogo {


    public static void imprimeTabuleiro(String matriz[][]) {
        int l, c;
        String imprimematriz[][] = new String[3][3];
        imprimematriz = matriz;
        

        for(l = 0; l < 3; l++) {
            for(c = 0; c < 3; c++) {
                System.out.print("[ " + imprimematriz[l][c] + " ]");
            }
            System.out.println("");
        }
        

    }

    public static int sorteiaJogador(String playerUm, String playerDois) {
        int sorteia = new Random().nextInt(2);
        if (sorteia==0){
            System.out.println("Quem irá iniciar é: " + playerUm);
        }
        if (sorteia==1){
            System.out.println("Quem irá iniciar é: " + playerDois);
        }
        return sorteia;
    }

    public static void alternaturno(int num, String jogadorUm, String jogadorDois) {
        if(num % 2 == 0) {
            System.out.println("É a vez de: " + jogadorUm);
        } else {
            System.out.println("É a vez de: " + jogadorDois);
        }
    }

    public static void menu() {

        System.out.println("--------MENU--------");
        System.out.println("1: iniciar jogo");
        System.out.println("2: Mudar jogadores");
        System.out.println("3: Sair do jogo");
        System.out.print("Digite aqui: ");

        
    }

    public static int verificaGanhador(String matriz[][]) {
        int r = 0;
        if(matriz[0][0] == "O" && matriz[0][1] == "O" && matriz[0][2]  == "O" ||
            matriz[1][0] == "O" && matriz[1][1] == "O" && matriz[1][2]  == "O" ||
            matriz[2][0] == "O" && matriz[2][1] == "O" && matriz[2][2]  == "O" ||

            matriz[0][0] == "O" && matriz[1][0] == "O" && matriz[2][0]  == "O" ||
            matriz[0][1] == "O" && matriz[1][1] == "O" && matriz[2][1]  == "O" || 
            matriz[0][2] == "O" && matriz[1][2] == "O" && matriz[2][2]  == "O" ||

            matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2]  == "O" ||
            matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0]  == "O") {
                System.out.println("O venceu");
                r = 1;
                       
            } 

            if(matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2]  == "X" ||
            matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2]  == "X" ||
            matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2]  == "X" ||
 
            matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0]  == "X" ||
            matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1]  == "X" ||
            matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2]  == "X" ||
 
            matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2]  == "X" ||
            matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0]  == "X") {
                    System.out.println(" X venceu");
                    r = 1;
                        
           }

            return r;
    }

    
    
    public static void iniciaJogo(String playerUm, String playerDois){
        Scanner entrada = new Scanner(System.in);
        int jogadas = 0;
        int posiçao = 0;
        String simbolo;
        int controle;
        String jogadorUm = playerUm;
        String jogadorDois = playerDois;

        String matriz[][] = new String[3][3];
        int l, c;

        // Linha Um
        matriz[0][0] = "1";
        matriz[0][1] = "2";
        matriz[0][2] = "3";

        // Linha Dois
        matriz[1][0] = "4";
        matriz[1][1] = "5";
        matriz[1][2] = "6";

        // Linha Tres
        matriz[2][0] = "7";
        matriz[2][1] = "8";
        matriz[2][2] = "9";

        controle = sorteiaJogador(jogadorUm, jogadorDois);

        for(l = 0; l < 3; l++) {
            for(c = 0; c < 3; c++) {
                System.out.print("[ " + matriz[l][c] + " ]");
            }
            System.out.println("");
        }
        
        
        
        
        while(jogadas < 10) {

            
         
            int r = verificaGanhador(matriz);
            if(r == 1) {
                break;
            }
            
            
            if(jogadas % 2 == 0) {
                simbolo = "O";
            }else {
                simbolo = "X";
            }

            if(jogadas > 8) {
                System.out.println("VELHA");
                break;
            } else {
                posiçao = entrada.nextInt();
            }

            if(posiçao == 1 && matriz[0][0] == "1") {
                matriz[0][0] = simbolo;
                imprimeTabuleiro(matriz);
                
            }else if(posiçao == 2 && matriz[0][1] == "2") {
                matriz[0][1] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 3 && matriz[0][2] == "3") {
                matriz[0][2] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 4 && matriz[1][0] == "4") {
                matriz[1][0] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 5 && matriz[1][1] == "5") {
                matriz[1][1] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 6 && matriz[1][2] == "6") {
                matriz[1][2] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 7 && matriz[2][0] == "7") {
                matriz[2][0] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 8 && matriz[2][1] == "8") {
                matriz[2][1] = simbolo;
                imprimeTabuleiro(matriz);
            }else if(posiçao == 9 && matriz[2][2] == "9") {
                matriz[2][2] = simbolo;
                imprimeTabuleiro(matriz);
            }else {
                System.out.println("Esse lugar já foi marcado");
                System.out.println("Escolha outro lugar e aperte enter");
                continue;
            }
            
            controle++;
            alternaturno(controle, jogadorUm, jogadorDois);
            jogadas++;

        }
    }

    public static void sair() {
        System.out.println("SAINDO...");
    }

    public static String[] inserirnome(){
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[2];

        System.out.println("Insira o nome dos jogadores, Apenas letras");
        System.out.println("Digite o nome do primeiro jogador");
        nomes[0] = s.next();
        System.out.println("Digite o nome do segundo jogador");
        nomes[1] = s.next();
        
        return verificaNome(nomes[0], nomes[1]);

        
        
    }

    public static String[] verificaNome(String playerum, String playerdois) {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[2];
        nomes[0] = playerum;
        nomes[1] = playerdois;

        while(nomes[0].contains("1") || nomes[0].contains("2") || nomes[0].contains("3") 
        || nomes[0].contains("4") || nomes[0].contains("5") || nomes[0].contains("6") 
        || nomes[0].contains("7") || nomes[0].contains("8") || nomes[0].contains("9") 
        || nomes[0].contains("0") ) {
            System.out.println("Digite o nome do jogador 1 novamente");
            nomes[0] = s.next();
        }

        while(nomes[1].contains("1") || nomes[1].contains("2") || nomes[1].contains("3") 
        || nomes[1].contains("4") || nomes[1].contains("5") || nomes[1].contains("6") 
        || nomes[1].contains("7") || nomes[1].contains("8") || nomes[1].contains("9") 
        || nomes[1].contains("0") ) {
            System.out.println("Digite o nome do jogador 2 novamente");
            nomes[1] = s.next();
        }
        return nomes;
    }
    

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int controle;
        String playerUm = " ";
        String playerDois = " ";
        String[] nomes;

        do{
            menu();
            controle = s.nextInt();

            switch (controle) {
                case 1:
                    if(playerUm == " " || playerDois == " ") {
                        nomes = inserirnome();
                        playerUm = nomes[0];
                        playerDois = nomes[1];
                        break;
                    }
                    iniciaJogo(playerUm, playerDois);
                    break;
            
                case 2:
                    nomes = inserirnome();
                    playerUm = nomes[0];
                    playerDois = nomes[1];
                    break; 
                    
                case 3:
                    sair();
                    break;    
                default:
                    System.out.println("Escolha uma das 3 opções");
                    break;
            }
        } while(controle != 3);
       


    }
}