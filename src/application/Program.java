package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>(); // DADOS DESORDENADOS
		//Set<String> set = new TreeSet<>(); // DADOS ORDENADOS
		Set<String> set = new LinkedHashSet<>(); // MANTEM A ORDEM
		
		//ADICIONA OS VALORES NO SET TIPO STRING
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Geladeira");
		set.add("Fogão");
		set.add("Armario");
		
		set.remove("Fogão"); // REMOVE DE ACORDO COM O VALOR DESEJADO
		set.removeIf(x -> x.length() > 9); // REMOVE TODOS OS QUE SATISFAZER O PREDICADO DESEJADO. (Nesse caso palavras com mais letras que 9)
		set.removeIf(x -> x.charAt(0) == 'T'); // REMOVE TODOS QUE TEM A O VALOR IGUAL A PRIMEIRA LETRA T
		
		System.out.println(set.contains("Notebook"));
		
		for (String p: set) {
			System.out.println(p);
		}
	}

}
