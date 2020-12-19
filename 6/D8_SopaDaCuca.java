import java.util.Scanner;

public class D8_SopaDaCuca {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            int abacaxi = scan.nextInt();
            int banana = scan.nextInt();
            int goiaba = scan.nextInt();
            int maracuja = scan.nextInt();

            String ingredientes = scan.nextLine();

            int contA = 0;
            int contB = 0;
            int contG = 0;
            int contM = 0;

            if (ingredientes.contains("a")){
                contA++;
            }
            if (ingredientes.contains("b")){
                contB++;
            }
            if (ingredientes.contains("g")){
                contG++;
            }
            if (ingredientes.contains("m")){
                contM++;
            }

            
            if(abacaxi == contA && banana == contB && goiaba == contG && maracuja == contM) System.out.println ("1");
            if(abacaxi >= contA && banana >= contB && goiaba >= contG && maracuja >= contM){
                
                if( ){}

            }
            else System.out.println ("0");





        }
		

        
    }
}
