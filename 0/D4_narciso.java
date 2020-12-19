import java.util.Scanner;

public class D4_narciso {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        int n = sc1.nextInt();
        sc1.nextLine();
        int a,b;
        int letra = 0;
        for (int i =0 ; i< n; i++){
            String ope = sc1.nextLine();
            for(int j = 0; j < ope.length(); j++){
                if(!(Character.isDigit(ope.charAt(j)))) {
                    letra = j;
                    break;
                }
            }
            a = Integer.parseInt(ope.substring(0, letra));
            b = Integer.parseInt(ope.substring(letra+1, ope.length()));
            int res =0;
            switch(ope.charAt(letra)){
                case 'n':
                    res = a+b;
                    break;
                case 'a':
                    res = a-b;
                    break;
                case 'r':
                    res = a*b;
                    break;
                case 'c':
                    res = a/b;
                    break;
                case 'i':
                    int respa = 1;
                    for(int j = a; j > 0; j--) respa = respa*j;
                    int respb = 1;
                    for(int j = b; j > 0; j--) respb = respb*j;
                    res = respa/respb;
                    break;
                case 's':
                    res = a%b;
                    break;
                case 'o':
                    res = 1;
                    for (int j =0 ; j < b ; j++){
                        res = res * a;
                    }
                    break;
            }
            System.out.println(res);
        }
    }
}