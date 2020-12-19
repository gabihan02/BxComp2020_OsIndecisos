import java.util.Scanner;

public class D6_Placar{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		while(true){

			int tempo = input.nextInt();

			if(tempo == 0)
				System.exit(0);

			int[][] placar = new int[tempo][4];

			for(int i = 0; i < tempo; i++)
				for(int j = 0; j < 4; j++)
					placar[i][j] = input.nextInt();

			trocarPlacar(placar);
			trocarPlacar(placar);

			int[] r = resultado(placar);

			System.out.printf("Real Madeira %d X %d Gods United\n", r[0], r[1]);

			if(r[0] > r[1])
				System.out.println("Hoje tem churrasco rapaziada!!");

			else if(r[0] < r[1])
				System.out.println("Vamos virar carvao :(");

			else
				System.out.println("Nada acontece, feijoada.");
		}

	}

	public static void trocarPlacar(int[][] placar){
		int[] troca = posMaiorDiferenca(placar);

		int temp = placar[troca[0]][troca[1]];
		placar[troca[0]][troca[1]] = placar[troca[0]][troca[2]];
		placar[troca[0]][troca[2]] = temp;
	}

	public static int[] resultado(int[][] m){
		
		int[] r = new int[2];

		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < 2; j++)
				r[0] += m[i][j];

			for(int j = 2; j < 4; j++)
				r[1] += m[i][j];
		}

		return r;
	}

	public static int[] posMaiorDiferenca(int[][] m){

		// 0 -> linha / 1 -> coluna do madeira / 2 -> coluna do gods
		int[] pos = new int[3];

		int dif = 0;

		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < 2; j++)
				for(int k = m[0].length - 1; k > 1; k--)
					if(m[i][k] - m[i][j] > dif){
						dif = m[i][k] - m[i][j];
						pos[0] = i;
						pos[1] = j;
						pos[2] = k;
					}

		return pos;
	}
}
