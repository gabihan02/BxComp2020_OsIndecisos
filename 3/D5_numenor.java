import java.util.Scanner;
import java.lang.Math;

// INCOMPLETO
// Lembrar de mudar o nome da classe!!
public class D5_numenor{

	public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
	
        String[] governantes = (scan.nextLine()).split("\n");
        String[][] govOrganizado = new String[governantes.length][4];

/*
    0- nome
    1- tempo de vida
    2- reinado
    3- tempo reinado
*/

for(int i=0; i<governantes.length; i++){

    govOrganizado[i][0] = buscarNome(governantes[i]);
    govOrganizado[i][1] = buscarTempoVida(governantes[i]);
    govOrganizado[i][2] = buscarReinado(governantes[i]);
    govOrganizado[i][3] = (buscarTempoReinado(governantes[i]));
   
}
        String proxLinha = scan.nextLine();
		while(!(proxLinha.toLowerCase().equals("fim"))){
            boolean copiandoNome = false;

            int cont =-1;
            while(!(govOrganizado[cont+1][0].toLowerCase()).equals(proxLinha.toLowerCase()) && cont>governantes.length){
                cont++;
            }

            if(cont==-1){
                System.out.println("Erro => "+proxLinha+" nao encontrado(a)");
            }else{
                System.out.println("Nome => "+govOrganizado[cont][0]+", Tempo de Vida => "+govOrganizado[cont][0]+", Reinado => "+govOrganizado[cont][2]+", Tempo Reinado => "+ govOrganizado[cont][3]);
            }
            
        }

        
    }

    public static String buscarNome(String gov){
        boolean copiandoNome = false;
        String nome ="";

        for(int j=0; j<gov.length();j++){
            if(copiandoNome==true){
                nome+=gov.charAt(j);
            }

            if(gov.charAt(j) == '<'){
                copiandoNome = true;
                
            }else if(gov.charAt(j) == '>'){
                copiandoNome = false;
            }                                                          
        }

        return nome;

    }

    static int localMenos;

    // anos>=10 && anos<=999
    public static String buscarTempoVida(String gov) {
        boolean copiandoTempo = false;
        String tempo = "";

        for (int j = 0; j < gov.length(); j++) {
            if (copiandoTempo == true) {
                tempo += gov.charAt(j);
            }

            if (gov.charAt(j) == '+' && Character.isDigit(gov.charAt(j + 1))) {
                copiandoTempo = true;
            } else if (gov.charAt(j) == '-') {
                copiandoTempo = false;
                localMenos = j;
            }                                                          
        }

        if(tempo.length() >= 2 && tempo.length() <= 3) {
            return tempo;
        }else{
            return "";
        }

    }
    
    public static String buscarReinado(String gov){
        boolean achouMais = false;
        String reinado ="";

            for (int j = localMenos+1; j <= localMenos+9; j++) {
                reinado+=gov.charAt(j);
            }

        System.out.println(reinado);
        return reinado;
    }
    
    public static String buscarTempoReinado(String gov) {
        
        String reinado = buscarReinado(gov);

        String[] anos = (reinado.split("-"));
        int tempoReinado = Integer.valueOf(anos[1])-Integer.valueOf(anos[0]);


        return (Integer.toString(tempoReinado));
    }
}