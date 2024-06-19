package mazJava;

public class TopologiaJavpart2 {

	public static void main(String[] args) {
		char a[][] = { 
				{' ', ' ', ' ', 'd',},
				{' ', ' ', 'h',},
				{' ', 'l',},
				{'p',}
		};
		
		for (char[]matriz: a) {
			for(char coluna : matriz) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}

	}

}
