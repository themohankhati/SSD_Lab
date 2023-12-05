package lab_6;

import java.util.*;
import java.util.Map.Entry;

public class WordCounter {
	/*
	 * Maps to their occurrence count
	 * 
	 */
	
	final Map<String, Integer> wordMap=new HashMap<String, Integer>();
	
	public void addWord(String word)
	{
		//if word already exits
		if (wordMap.containsKey(word))
		{
			//if yes, increment its word count
			int count=wordMap.get(word);
			wordMap.put(word, count+1);
		
		}
		
		else
		{
			//if word is new
			wordMap.put(word, 1);

			//if no, insert the word with the occurrence value
			for(Map.Entry<String, Integer> entry:wordMap.entrySet())
			{
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
		}
	}
	



	/*
	 * 
	 */
	public void addSentence(String sentence)
	{
		String[] words=sentence.split(" ");
		
		//add each word to the wordMap using addWord
		for(String word: words)
		{
			addWord(word);
		}
	}
	
	/*
	 * displaying occurrence of the sentence
	 */
	public final void outputResults()
	{
		for(Map.Entry<String, Integer> entry:wordMap.entrySet())
		{
			System.out.println(entry.getKey()+ ":"+ entry.getValue());
		}
	}
}
