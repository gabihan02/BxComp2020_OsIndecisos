import java.util.Scanner;

public class D1_barris{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i<t;i++){
            String frase = sc.nextLine();
            System.out.println(testa(frase));
        }
    }
    public static String testa(String frase){
        Scanner analise = new Scanner(frase);
            float b1=analise.nextFloat();
            float t1=analise.nextFloat();
            float b2=analise.nextFloat();
            float t2=analise.nextFloat();
            if(t1>=0.14){
                return "Hehe, esse aqui ta no ponto. Guardem o barril 2 pra depois.";
            }else if(t2>=0.14){
                return "Hehe, esse aqui ta no ponto. Guardem o barril 1 pra depois.";
            }else{
                
            }
    }
}