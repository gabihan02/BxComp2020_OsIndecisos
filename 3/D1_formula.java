import java.util.Scanner;

public class D1_formula {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        
		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
          
            
            int m = scan.nextInt();
            int result = 1;

            for(int j=1; j<=m; j++){
                result = result*j;
            }

            System.out.println(result);
            
            

        }
 

        

        
        


        
    }
    
}
