/*
	Código Base para execução dos Desafio do BXComp!!
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;

// Lembrar de mudar o nome da classe!!
public class D1_troca{

// 1 ano = 12 meses
// 1 mes = 30 dias
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            String entrada = scan.nextLine();
            String[] data = entrada.split(" ");
            
            int ini = entrada.indexOf('/');
            int dia = Integer.parseInt(entrada.substring(0,ini));
            int mes = Integer.parseInt(entrada.substring(3,5));
            int ano = Integer.parseInt(entrada.substring(6,10));

      // 02/05/202011
      // ini = 2

            int Hdia = 30;
            int Hmes = 10;
            int Hano = 2020;

            int diferenca = (Hano-ano)*360 + (Hmes-mes)*30 + (Hdia-dia);

            int soma = diferenca/180; //
  /*          while(diferenca >= 0){
                diferenca = diferenca/180;
                soma ++;
            }
*/
            if (entrada.contains("M")){

                if(soma == 0) System.out.println("Oxumare eh mulher, esta protegendo a terra.");
                else{
                    if(soma%2 == 0){
                        System.out.println("Oxumare eh mulher, esta protegendo a terra.");
                    }else  System.out.println("Oxumare eh homem, podemos ver um arco-iris.");
                }

            }else if(entrada.contains("H")){

                if(soma == 0) System.out.println("Oxumare eh homem, podemos ver um arco-iris.");
                else{
                    if(soma%2 == 0){
                        System.out.println ("Oxumare eh homem, podemos ver um arco-iris.");
                    }else  System.out.println ("Oxumare eh mulher, esta protegendo a terra.");
                }
            }





        }
		

        
    }

}