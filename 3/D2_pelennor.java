import java.util.Scanner;
import java.lang.Math;


// Lembrar de mudar o nome da classe!!
public class D2_pelennor{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        
        int d1, d2, vy, vx; //4 num

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            double tempo;
            int aceleracao = 10;

            d1 = scan.nextInt();
            d2 = scan.nextInt();
            vy = scan.nextInt();
            vx = scan.nextInt();

            tempo = ((vy-0)/aceleracao)*2;
            int deslo = vx*(int)tempo;


            if(d1<=deslo && deslo<=d2) System.out.println("YEEEEET");
            else System.out.println("Traga mais uma pedra!!");
        }
		

        
    }
}
