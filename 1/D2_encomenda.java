import java.util.Scanner;

public class D2_encomenda {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        
        String[] chaves = {"khat", "ka", "ba", "sahu", "sekhem", "ren", "shwt", "ab","akh"};


/*
Individuos mortais: Khat,  Ka,  Ba,Sahu, Sekhem, Ren, Shwt e Ab

Deuses e ancestrais precisam de:  Akh, Sekhem e Ren
e nao podem ter: Ka e Ba

estejam de acordo com as partes de um mortal: "Alma mortal pronta para ser empacotada."
Deuses OU ancestrais: "Opa, ancestrais e deuses nao empacotam duas vezes."
NENHUM: "Tem e uma bagunca espiritual aqui!"

*/

        // Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            String teste = scan.nextLine().toLowerCase();
            
            if(teste.contains("khat")&&teste.contains("ka")&&teste.contains("ba")&&teste.contains("sahu")&&teste.contains("sekhem")&&teste.contains("ren")&&teste.contains("shwt")&&teste.contains("ab")
            &&!(teste.contains("akh"))){
                System.out.println("Alma mortal pronta para ser empacotada.");
            }else if(teste.contains("akh")&&teste.contains("sekhem")&&teste.contains("ren")&&!(teste.contains("ka"))&&!(teste.contains("ba"))){
               
               System.out.println("Opa, ancestrais e deuses nao empacotam duas vezes.");
           
            }else{
                System.out.println("Tem e uma bagunca espiritual aqui!");
            }
           
            
        }
		

        
    }
}


/*
KhatKaBaSahuSekhemRenShwtAb
AKHKHATRENABSEKHEM
absekhemrensahubakhatkashwt
AkhBaRenKaSekhem


*/