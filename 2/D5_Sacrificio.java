import java.util.Scanner;

public class D5_Sacrificio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            String[] datas = sc.nextLine().split(" ");

            String[] data1 = datas[0].split("/");
            String[] data2 = datas[1].split("/");

            int dia1 = Integer.parseInt(data1[0]);
            int mes1 = Integer.parseInt(data1[1]);
            int ano1 = Integer.parseInt(data1[2]);           
            
            int dia2 = Integer.parseInt(data2[0]);
            int mes2 = Integer.parseInt(data2[1]);
            int ano2 = Integer.parseInt(data2[2]);

            int total = (ano2-ano1)*360 + (mes2-mes1)*20 + (dia2-dia1);

            if(total<0) total *= -1;

            if(total>360) System.out.printf("oh nao, atrasei %d dias o sacrificio, o deus Huitzilopochtli vai ficar pistola D:\n", total-300);
            else System.out.println("O universo esta perfeitamente balanceado, como todas as coisas devem ser");
        }
    }
}
