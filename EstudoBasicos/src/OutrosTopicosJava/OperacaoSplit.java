package OutrosTopicosJava;

public class OperacaoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bloco1 bloco2 bloco3";
		String[] vetString = s.split(" ");
		String word1 = vetString[0];
		String word2 = vetString[1];
		String word3 = vetString[2];
		System.out.println("Vetores " + vetString[0] + vetString[1] + vetString[2] );
	}

}
