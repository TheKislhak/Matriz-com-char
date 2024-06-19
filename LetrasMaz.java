package mazJava;

public class LetrasMaz {

	public static void main(String[] args) {
		char a[][] = { 
				{'a', 'b', 'c', 'd', 'e'},
				{'f', 'g', 'h', 'i', 'j'},
				{'k', 'l', 'm', 'n', 'o'},
				{'p', 'q', 'r', 's', 't'}
		};
		
		for (char[]letra : a) {
			for(char coluna : letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}

	}

}
