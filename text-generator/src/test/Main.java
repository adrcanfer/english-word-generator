package test;
import generator.Generator;
import generator.Word.WordType;

public class Main {
	public static void main(String[] args) {
		System.out.println(Generator.randomWord(WordType.n));
		System.out.println(Generator.randomWord(WordType.n, 100L));
	}
}
