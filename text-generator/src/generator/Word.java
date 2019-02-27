package generator;

public class Word {
	private String word;
	private WordType wordType;
	
	public Word (String text) {
		String[] word = text.split(",");
		this.setWord(word[1]);
		switch(word[2]) {
		case "a":
			this.setWordType(WordType.a);
			break;
		case "v":
			this.setWordType(WordType.v);
			break;
		case "c":
			this.setWordType(WordType.c);
			break;
		case "i":
			this.setWordType(WordType.i);
			break;
		case "t":
			this.setWordType(WordType.t);
			break;
		case "p":
			this.setWordType(WordType.p);
			break;
		case "d":
			this.setWordType(WordType.d);
			break;
		case "x":
			this.setWordType(WordType.x);
			break;
		case "n":
			this.setWordType(WordType.n);
			break;
		
		}
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public WordType getWordType() {
		return wordType;
	}

	public void setWordType(WordType wordType) {
		this.wordType = wordType;
	}

	public enum WordType{
		a, v, c, i, t, p, d, x, n
	}

}


