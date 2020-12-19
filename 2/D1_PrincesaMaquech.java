import java.util.Scanner;
import java.lang.Math;

// Lembrar de mudar o nome da classe!!
public class D1_PrincesaMaquech{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

       

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            int num = Integer.valueOf(scan.nextLine());
            char[] frase = (scan.nextLine().toLowerCase()).toCharArray();
            
             for(int j=0; j<frase.length; j++){

                if(frase[j]!=' '){

                    if(j+num<=alfabeto.length){
                        System.out.print(alfabeto[j+num]);
                    }else{
                        System.out.print(alfabeto[alfabeto.length-j+num]);
                    }

                }
                System.out.println("");

             }

        }
        
        
        
        
    }

}


/*
    3
    'A' 'B' 'C' 'D' 'E' 
    

*/