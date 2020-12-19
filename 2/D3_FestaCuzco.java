import java.util.Scanner;

public class D3_FestaCuzco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        while(!nome.equals("Acabaram os convidados")){
            String[] nomeSeparado = nome.split(" ");
            if(nomeSeparado[0].equals("Inka")){
                System.out.println("Aproveite a festa, Vossa Majestade.");
            }
            else if(nomeSeparado[0].equals("Comandante") || nomeSeparado[0].equals("General")||nomeSeparado[0].equals("Major")){
                System.out.println("* Continencia *. Sim Senhor! Entrada Permitida.");
            }
            else if((nome.indexOf("Coletor de Impostos") != -1) && (nome.indexOf("Coletor de Impostos") == nome.lastIndexOf("Coletor de Impostos")) && (nome.indexOf("Coletor de Impostos") == 0 || nome.indexOf("Coletor de Impostos") == (nome.length() - "Coletor de Impostos".length()))){
                System.out.println("Deixe seus tributos no balcao e seja bem vindo.");
            }
            else{
                System.out.println("Pegue sua Lhama e vaza daqui!");
            }
            nome = sc.nextLine();
        }
    }
}