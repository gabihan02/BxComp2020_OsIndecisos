/*
	Código Base para execução dos Desafio do BXComp!!
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;


// Lembrar de mudar o nome da classe!!
public class kaluana{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            int x = scan.nextInt();
            int y = scan.nextInt();

            int amarelo = 40;
            int vermelho = 55;
            int azul = 70;
            int preto = 85;
            int branco = 100;

            int distancia = (int) (Math.round(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))));

            if (distancia <=40) System.out.println("Faixa amarela! Voce sera o melhor cacador da aldeia!");
            else if (distancia >40 && distancia <=55) System.out.println("Faixa vermelha!  Quase la, nao desista!");
            else if (distancia >55 && distancia <=70) System.out.println("Faixa azul!  Por pouco!");
            else if (distancia >70 && distancia <=85) System.out.println("Faixa preta!  Continue tentando!");
            else if (distancia >85 && distancia <=100) System.out.println("Faixa branca, preste atencao!!");
            else System.out.println("Vish, passou longe...");
       
           
            
            
        }
		

        
    }

}