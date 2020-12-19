/*
	Código Base para execução dos Desafio do BXComp!!
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;


// Lembrar de mudar o nome da classe!!
public class D4_snujs{

    public static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
    public static void main(String[] args){

        char[] correto = {'E','-','D','-','D','-','D','-','E','-','D','-','E','-','E','-','D','-','E','-','E','-','D'};

        DecimalFormat df = new DecimalFormat("#.0");
        

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            char[] toque = (scan.nextLine()).toCharArray();


            int certo=0, j=0;

            while((j<toque.length)&&(toque[j]==correto[j])){
                certo++;
                j++;
            }
        
            
            double valor;
            valor = (double) certo/24;
            double teste=(double) 3/4;


            if(valor>=teste){
                System.out.println("Cheguei meninaxx!");
            }else{
                
                if((int)(valor*100)==valor*100) {
                    System.out.printf(((int)(valor*100))+("%% de dedicacao...estou ocupada escovando meus gatos!\n"));
                } else {
                    System.out.printf(df.format(valor*100)+"%% de dedicacao...estou ocupada escovando meus gatos!");
                }
                
            }

        }
		
/*
E-D-D-D-E-D-E-E-D-E-E-D  
E-D-D-D-E-D-D-E-D-D-E-D
E-E-E

50% de dedicacao...estou ocupada escovando meus gatos!
50% de dedicacao...estou ocupada escovando meus gatos!
*/ 
        
    }

}