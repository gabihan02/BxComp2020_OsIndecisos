import java.util.Scanner;

public class D2_ElDorado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            String entrada = scan.nextLine();

            if(entrada.equals("")) System.exit(0);
            
            String[] nomes = entrada.split(" ");

            if(saoDeuses(nomes[0], nomes[1])) System.out.println("Todos saudam os deuses");
            else System.out.println("Eles sao forasteiros, joguem no vulcao!!");

        }
    }

    public static boolean saoDeuses(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        return isFisrtEqualsLast(s1) && isFisrtEqualsLast(s2) && isLengthOdd(s1) && isLengthOdd(s2) && aVogal(s1) &&aVogal(s2);
        
    }
    
    public static boolean isFisrtEqualsLast(String s){
        return s.charAt(0) == s.charAt(s.length()-1);
    }

    public static boolean isLengthOdd(String s){
        return s.length() %2 !=0;
    }

    public static boolean aVogal (String s){
        
        for(int i = 0; i<s.length(); i++)
            if(s.charAt(i) == 'a')
                if(checkVogal(s, i))
                    return true;
        
        return false;
        
    }
    
    public static boolean checkVogal(String s, int n) {
        String vogals = "eiou";
        
        if(n>0)
            if(vogals.contains("" + s.charAt(n-1))) 
                return true;

        if(n < s.length()-1)
            if(vogals.contains("" + s.charAt(n+1)))
               return true;
               
        return false;
    }


}
