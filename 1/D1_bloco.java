/*
    entrada:
    a primeira linha de entrada é um interiro n, sendo n
    o número de casos de teste. As proximas n linhas são
    cada teste. Um teste é formado apenas pela altura h,
    sendo H Um inteiro maior ou igual a 0 e que 1 bloco é 1 de H.

    saida:
    a saída deverá ser uma Sring com o texto:

*/

import java.util.Scanner;

public class bloco {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        int soma = 0;
        
		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            int teste = Integer.valueOf(scan.nextLine());
            if (teste < 2) System.out.println("Thoth seu doido isso nao eh uma piramide");
            if (teste >= 2){
                for (int j = teste; j>=1; j--){
                soma += j;
                } 
            System.out.println("Sao necessarios "+ soma+" blocos para a construcao");
            }
            soma = 0;
        }
		

        
    }
}
