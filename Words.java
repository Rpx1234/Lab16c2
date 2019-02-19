//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<String> words;

	public Words()
	{
		
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words = new ArrayList<String>();
		Scanner chopper = new Scanner(wordList);
		while (chopper.hasNext()){
			words.add(chopper.next());
		}
	}
	
	
	public int countWordsWithXChars(int size)
	{
		Word m = new Word();
		int count=0;
		for (int i = 0; i < words.size(); i++){
			m.setWord(words.get(i));
			if (m.getLength() == size)
				count ++;
		}




		return count;
	}
	
	public int removeWordsWithXChars(int size)
	{
		Word m = new Word();
		int count = 0;
		for (int i = 0; i < words.size(); i++){
			m.setWord(words.get(i));
			if (m.getLength() == size){
				count += m.getNumVowels();
				words.remove(i);
				i--;
			}
			

		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		Word m = new Word();
		for (int i = 0; i < words.size(); i++){
			m.setWord(words.get(i));
			if (m.getNumVowels() == numVowels)
				count ++;
		}
		
		return count;
	}

 public String toString()
 {
    return "";
 }
}