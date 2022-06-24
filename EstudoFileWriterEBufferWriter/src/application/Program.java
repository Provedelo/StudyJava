package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
	
		String pathWrite = "C:\\WorkSpace\\EscritaTexto.txt";
		
		String[] linesVect = new String [] {"Good morning", "good night"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite, true))){
			for (String line : linesVect) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error at file" + e.getMessage());
		}
		finally {
			System.out.println("end of program");
			System.out.println(pathWrite);
		}

	}

}
/* new FileWriter(pathWrite, true)
 * enquanto usa o (CAMINHO, TRUE) ele acrescenta as linhas
 * e nao recria do 0 o arquivo todo.
 */