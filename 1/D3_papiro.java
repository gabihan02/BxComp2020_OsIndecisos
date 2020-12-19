import java.util.Scanner;

public class D3_papiro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        int x, y;

        for (int n = 0; n<entrada; n++){
            x = sc.nextInt();
            y = sc.nextInt();

            if(verificar(x,y)){
                System.out.println("Esse deve ser preenchido!");
            }else{
                System.out.println("Ei, isso nao vai formar um triangulo!");
            }


        }


    }

    static boolean verificar(int x, int y){
        if(x>=9-y && y<=x) return true;
        return false;
    }
}
