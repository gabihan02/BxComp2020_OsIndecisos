import java.util.Scanner;

public class D3_tarefas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i = 0; i<t;i++){
            char[] frase = sc.nextLine().toCharArray();
            
            switch (frase[frase.length-1]){
                case '7':
                System.out.println("Eu capturei o touro de Creta");

                    break;
                case '8':
                System.out.println("Eu capturei os cavalos de Diomedes");
                
                    break;

                case '9':
                System.out.println("Eu obtive o cinto de Hipolita");
                    break;

                case '0':
                System.out.println("Eu roubei os gados de Geriao");
                    break;

                case '1':
                System.out.println("Eu consegui as macas de ouro");
                    break;

                case '2':
                System.out.println("Eu capturei Cerberos");
                    break;

                default:
                System.out.println("Vai catar coquinho, seu besta fracote");
                    break;
            }
        }
    }

}