import java.util.Scanner;
import java.lang.Math;

public class D6_ave {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String proxLinha = scan.nextLine();
        int cont1 = 0; 
        
        while (!proxLinha.equals("XIU!")) {
            cont1++;
            int cont =0;

            for (int i=0; i<proxLinha.length(); i++){

                if(proxLinha.charAt(i)=='F' || proxLinha.charAt(i)=='f'){

                    int j = i+1;
                    while((proxLinha.charAt(j)=='o' || proxLinha.charAt(j)=='O') && j<proxLinha.length()-1){

                        if(proxLinha.charAt(j+1)=='i' || proxLinha.charAt(j+1)=='I')cont++;
                            j++;
                        
                    }
                }
            }

            proxLinha = scan.nextLine();

            if(cont1>1){
                System.out.print("\n"+cont);
            }else{
                System.out.print(cont);
            }
            
            
            
        }   

    }

}
