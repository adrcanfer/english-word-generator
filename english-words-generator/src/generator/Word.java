package generator;

import java.util.List;
import java.util.Random;

public class Word {
	public static String randomWord() {
		List<String> words = ReadData.wordsList();
		return words.get(new Random().nextInt(words.size()));
	}
	
	public static String randomWordPair() {
		List<String> words = ReadData.wordsList();
		String res = "";
		res += words.get(new Random().nextInt(words.size()));
		res += " " + words.get(new Random().nextInt(words.size()));
		return res;
	}
}
