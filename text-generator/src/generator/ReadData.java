package generator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generator.Word.WordType;

public class ReadData {
	
	public static Map<WordType, List<String>> wordsList(){
		Map<WordType, List<String>> res = new HashMap<>();
		String csvFile = "data/words.csv";
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                Word word = new Word(line);
                if(res.containsKey(word.getWordType())) {
                	res.get(word.getWordType()).add(word.getWord());
                } else {
                	List<String> words = new ArrayList<String>();
                	words.add(word.getWord());
                	res.put(word.getWordType(), words);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
	}
}
