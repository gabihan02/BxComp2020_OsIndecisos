import java.util.ArrayList;
import java.util.Scanner;

public class D6_confissao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i=0; i<N;i++){
            String entrada = sc.nextLine();
            int conficoes = conficoes(entrada);
            if(conficoes>2){
                if(conficoes==7){
                    System.out.println("Amado que vida foi essa?");
                }else{
                    System.out.println("Parabens, o Ammit lhe espera");
                }
            }else if(teste(entrada)){
                System.out.println("Otimo, pode prosseguir para a balanca");
            }else{
                System.out.println("Parabens, o Ammit lhe espera");
            }
        }

    }
    public static int conficoes(String entrada){
        Scanner sc = new Scanner(entrada);
        int cont=0;
        while(sc.hasNext()){
            String atual = sc.next();
            if(atual.charAt(2)=='1'){
                cont++;
            }
        }
        
        return cont;
    }
    public static boolean teste(String entrada){
        Scanner sc = new Scanner(entrada);
        ArrayList<String> cases = new ArrayList();
        while(sc.hasNext()){
            cases.add(sc.next());
        }
        if(cases.get(0).charAt(2)=='0'){
            if(cases.get(2).charAt(2)=='1'||cases.get(3).charAt(2)=='1'||cases.get(6).charAt(2)=='1'){
                return false;
            }
        }
        if(cases.get(5).charAt(2)=='0'){
            if(cases.get(1).charAt(2)=='1'||cases.get(4).charAt(2)=='1'||cases.get(5).charAt(2)=='1'){
                return false;
            }
        }
        return true;
    }
    
}
