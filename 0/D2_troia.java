import java.util.Scanner;


public class D2_troia {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        
        while(!entrada[0].equals("C")){
            int g=0;
            boolean a=false;
            for(int i=0; i<entrada[0].length(); i++){
                switch(entrada[0].charAt(i)){
                    case 'G':
                        g++;
                        break;
                    case 'A':
                        a = !a;
                        break;
                }
            }

            if(a&&g>Integer.parseInt(entrada[1])-10) System.out.println("Eu que nao fico no caminho dele!");
            else if(g>Integer.parseInt(entrada[1])) System.out.println("Recuar!");
            else System.out.println("Atacar!");
            entrada = sc.nextLine().split(" ");
        }
        System.out.println("Ah que mal deve ser receber um presente de grego?");
    }
}
