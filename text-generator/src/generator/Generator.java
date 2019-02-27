package generator;

import java.util.Date;
import java.util.List;
import java.util.Random;

import generator.Word.WordType;

public class Generator {
	public static String randomWord(WordType wordType) {
		List<String> words = ReadData.wordsList().get(wordType);
		return words.get(new Random().nextInt(words.size()));
	}
	
	public static String randomWord(WordType wordType, Long seed) {
		List<String> words = ReadData.wordsList().get(wordType);
		return words.get(new Random(seed).nextInt(words.size()));
	}
	
	public static String randomWordPair(WordType wordType) {
		List<String> words = ReadData.wordsList().get(wordType);
		String res = "";
		res += words.get(new Random().nextInt(words.size()));
		res += " " + words.get(new Random().nextInt(words.size()));
		return res;
	}
	
	public static String randomPassword(int passwordLength) {
		String characters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz1234567890";
		String res = "";
		int randomCharacter = 0;
		for (int i = 0; i < passwordLength; i++) {
			randomCharacter = new Random().nextInt(characters.length());
			res += characters.substring(randomCharacter, randomCharacter+1);
		}
		return res;
	}
	
	@Deprecated
	public static String randomDate(Boolean past, String dividerDate) {
		Integer year = new Date().getYear() + 1900;
		Integer month = new Date().getMonth()+1;
		Integer day = new Date().getDate();
		if(past == true) {
			year -= 1;
		} else {
			year += 1;
		}
		return day.toString()+dividerDate+month.toString()+dividerDate+year.toString();
	}
}
