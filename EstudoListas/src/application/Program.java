package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Maria");
		list.add("Joao");
		list.add("Alex");
		list.add("Bob");
		list.add(2, "Marco");//add na posição 2 do vetor, o marco
		list.add("Marcia");
		list.add("Angelo");
		System.out.println(list.size());	//mostra o tam da lista
		for (String x : list) {
			System.out.println(x);		
		}
		System.out.println("-----------------");
		list.remove("Bob"); //compara o valor e pelo valor reconhece e remove
		list.remove(1); //remove o elemento da posiçao 1
		list.removeIf(x -> x.charAt(0) == 'M'); //usa predicado para filtro e neste caso remover qm tenha M
		for (String x : list) {
			System.out.println(x);		
		}
		System.out.println("-----------------");
		System.out.println("Index of Alex: " + list.indexOf("Alex")); //Produra posiçao de Alex na lista
		System.out.println("Index of marco: " + list.indexOf("Marco")); //Produra posiçao de Marco na lista
		
		System.out.println("-----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		// primeiro converte pra stream, faz operaçao lambda, retorna pra lista.
		for (String x : result) {
			System.out.println(x);		
		}
		
		System.out.println("-----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//encontrar um elemento da lista que atenda certo predicado, o primeiro elemento que encontra com a letra A neste exemplo.
		System.out.println(name);
	}

}
