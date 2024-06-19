package mazJava;

public class TopologiaJavpart1 {

	public static void main(String[] args) {
		char a[][] = { 
				{'a', 'b', 'c', 'd',},
				{'f', 'g', 'h',},
				{'k', 'l',},
				{'p',}
		};
		
		for (char[]linha : a) {
			for(char coluna : linha) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}

	}

}
