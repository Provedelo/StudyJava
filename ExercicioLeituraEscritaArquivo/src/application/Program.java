package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> prod = new ArrayList<Product>();
		File sourceFile = null;	
		
		System.out.println("Insert file path: ");
		System.out.println("Inserted: C:\\WorkSpace\\ExerciciosAvancados\\ExercicioLeituraEscritaArquivo\\ for test");
		//String strPath = sc.nextLine();
		String strPath = "C:\\WorkSpace\\ExerciciosAvancados\\ExercicioLeituraEscritaArquivo\\in.txt";
		sourceFile = new File(strPath); //pega caminho digitado
		
		String strSourceFolder = sourceFile.getParent(); //pega caminho 
		boolean success = new File(strSourceFolder + "\\out").mkdir(); //cria pasta out com caminho especificado
		
		String strTargetFolder = strSourceFolder + "\\out\\summary.csv"; //cria arquivo summary
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
				
			String itensCsv = br.readLine();
			while (itensCsv != null) {
				
				String[] fields = itensCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				double quantity = Double.parseDouble(fields[2]);
				prod.add(new Product(name, price, quantity));
				itensCsv = br.readLine();
				
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strTargetFolder))){
				for(Product item : prod) {
					bw.write(item.getName() + "," + String.format("%.2f \n", item.total()));
				} 
				System.out.println("Worked at create new folder (true or false)? " + success);
				System.out.println(sourceFile.getAbsoluteFile() + " Created! ");
			}
			catch(IOException e) {
				System.out.println("Error at writing file" + e.getMessage());
			}
		}
	
		catch(IOException e){
			System.out.println("Error at reading file " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
