import java.util.Scanner;
import java.lang.Math;

//  não está completo
public class D5_Ori{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.valueOf(scan.nextLine());

        String[] resultado = new String[n];


/*
    duas strings:
        - String 1: dimensao do tabuleiro de almas
        - String 2: 
    
        



*/




        for(int i=0;i<n;i++){

            resultado[i]="";
            char[] frase = (scan.nextLine()).toCharArray();

            for(int j=frase.length-1; j>=0;j--){
                resultado[i]+=frase[j];
            }

        }

        for(int i=0; i<n;i++){
        
            System.out.println(resultado[n]);
        }

        
    }

}