package mazJava;

public class TopologiaJavpart3 {

	public static void main(String[] args) {
		char a[][] = {
				{' ', ' ', 'a', ' ', ' '},
				{' ', ' ', 'a', ' ', ' '},
				{'a', 'a', 'a', 'a', 'a'},
				{' ', ' ', 'a', ' ', ' '},
				{' ', ' ', 'a', ' ', ' '}			
		};
		
		for(char[] matrizA : a) {
			for(char coluna : matrizA) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}

	}

}
