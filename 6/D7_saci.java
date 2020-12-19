import java.util.Scanner;

public class saci {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            long a = scan.nextLong();
            long b = scan.nextLong();
            long d = 0;

            if(a<= 9*Math.pow(10,18) && a >= -9*Math.pow(10,18) && b<= 9*Math.pow(10,18) && b >= -9*Math.pow(10,18)){
                double c = (a+b+(-11/384));
                d = (long) c;
            }
            if(d<= 9*Math.pow(10,18) && d >= -9*Math.pow(10,18)){
                System.out.print(d);
                System.out.print("\n");
            }
            


        }
        
    }
}
