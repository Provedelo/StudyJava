package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { //codigo basico para percorrer as linhas do arquivo
				System.out.println(sc.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.out.println("Error at file: " + e.getMessage());
		}
		finally { //exemplo basico de como se usa o finally
			if (sc != null) { //se o arquivo existir e abrir, ele acaba fechando o arquivo. 
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
	}

}
