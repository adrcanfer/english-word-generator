package test;
import generator.Generator;

public class Main {
	public static void main(String[] args) {
		System.out.println(Generator.randomPassword(10));
		System.out.println(Generator.randomDate(false, "-"));
	}
}
