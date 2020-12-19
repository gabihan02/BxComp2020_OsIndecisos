import java.util.Scanner;
// para cada n uma frase

// branco > vermelho > verde > preto > amarelo > azul > cinza > laranja > roxo
// sem nuvens               branco
// ensolarado               vermelho
// muitas nuvens            verde
// tempestade               preto
// sol encoberto            amarelo 
// chuva                    azul
// neblina                  cinza 
// sol fraco                laranja 
// garoa                    roxo



public class D3_Amaterasu{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=0; i<=n; i++){
            String entrada = scan.nextLine().toLowerCase();

            int cont = 0;

            if (entrada.contains("sem nuvens")){
                
                System.out.print("branco");
                cont++;
            }
            if (entrada.contains("ensolarado")) {
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("vermelho");
            }
            if (entrada.contains("muitas nuvens")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("verde");
            } 
            if (entrada.contains("tempestade")) {
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("preto");
            } 
            if (entrada.contains("sol encoberto")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("amarelo");
            } 
            if (entrada.contains("chuva")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("azul");
            } 
            if (entrada.contains("neblina")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("cinza");
            } 
            if (entrada.contains("sol fraco")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("laranja");
            } 
            if (entrada.contains("garoa")){
                
                if(cont>0){
                    System.out.print(" - ");
                }
                cont++;
                System.out.print("roxo");
            } 
            if (i!=0 && i!=n) System.out.println("");
    

        }
            
    }
}


