import static java.lang.System.*;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou"; 

	public Word()
	{
		
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		for (int x = 0; x < getLength(); x++){
			for (int y = 0; y < vowels.length(); y++){
				if (vowels.substring(y, y + 1).equals(word.substring(x, x + 1)))
					count ++;
			}
		}
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word + "\nnum vowels == " + getNumVowels() + "\nnum chars == " + getLength() + "\n";
	}

	public void setWord(Word word2) {
	
		
	}
}