import java.util.Scanner;

public class D4_conquistandoIncas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean conquistou = false;
        int totalPopulacao = sc.nextInt();
        sc.nextLine();
        int totalExercito = (int)Math.floor(totalPopulacao/2);
        String instruc = sc.nextLine();
        while (!instruc.equals("Bora Comemora!")) {
            String[] instrucSep = instruc.split(" ");
            int totExercInimigo = (int) Math.floor((Integer.parseInt(instrucSep[1]))/2);
            int porcentagem = (int)Math.floor((totExercInimigo * 100)/totalExercito);
            if(porcentagem <= 10){ //Sem Batalha
                conquistou = true;
                totalExercito += totExercInimigo;
                System.out.println(instrucSep[0] + " aceitou o acordo e agora faz parte do nosso Imperio!");
            }else if(porcentagem <= 70){ //Com Batatlha
                conquistou = true;
                totalExercito += (int )Math.floor(totExercInimigo/2);
                System.out.println("Apos uma grande batalha, vencemos de "+instrucSep[0] + ", e eles se uniram ao nosso Imperio!");
            }else{ //Não possivel ganhar
                System.out.println("Quale Comandante, melhor meter o pe...");
            }
            instruc = sc.nextLine();
        }
        System.out.println("Nosso Imperio agora tem " + totalExercito + " soldados!");
        if(conquistou){
            System.out.println("Que Mama-Quilla abencoe as novas terras e seu plantio!");
        }
    }
}