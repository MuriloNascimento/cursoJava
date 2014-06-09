package matematica;

public class Grafos {
	
	public static int contaVizinhos(int x[][]){
		int vizinhos = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++){
				vizinhos = vizinhos + x[i][j];
			}
		}
		return vizinhos;
	}
	
	

	public static void main(String[] args) {
		
		int[][] grafo = {
			{0,1,0,1,1,0,0,0},
			{0,0,1,0,0,0,0,0},
			{1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,1},
			{0,0,0,1,0,0,1,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,1,0,0,0},
		};
		
		System.out.println(contaVizinhos(grafo)/8);

	}

}
