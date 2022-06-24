package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("GetName: " + path.getName()); //pega o nome do arquivo
		System.out.println("GetPath: " + path.getPath()); //pega o caminho
		System.out.println("GetFreeSpace: " + path.getFreeSpace()); //pega o caminho
		
		try{
			File[] folders = path.listFiles(File::isDirectory);
			File[] files = path.listFiles(File::isFile);
	
			for (File folder : folders) {
				System.out.println("Folder: " + folder);
			}
			for (File file : files) {
				System.out.println("File: " + file);
			}
			
			boolean success = new File(strPath + "\\CRIANDOPASTATESTE").mkdir(); //cria uma subpasta chama subdir a partir do diretorio digitado
			System.out.println("Directory created (true/false)?: " + success);
		} 
		catch (NullPointerException e) {
			System.out.println("Error, path not founded or " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
				System.out.println("End of application!");
			}
		}

	}
}
/*
 * referencia a metodos, c/ funcao de especificar e listar os diretorios e
 * pastas File[] folders = path.listFiles(File::isDirectory); File[] apps =
 * path.listFiles(File::isFile);
 */