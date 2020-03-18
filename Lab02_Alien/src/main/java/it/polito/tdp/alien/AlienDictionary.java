package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List <WordEnhanced> words;
	
	public AlienDictionary() {
		words=new ArrayList<> ();
	}
	
	public void addWord (String alienWord, String translation) {
		
		if (alienWordPresent(alienWord)==false) {
			words.add(new WordEnhanced (alienWord,translation) );
		}
		
		for (WordEnhanced we:words) {
			if (alienWord.equals(we.getAlienWord())) {
				if (we.getTranslation().contains(translation)==false)
					we.setTranslation(translation);
			}		 
		}
		
	}
	
	public String translateWord (String alienWord) {
		for (WordEnhanced w:words) {
			if (w.getAlienWord().equals(alienWord))
				return w.translationsToString();
		}
		return null;
	}
	
	public boolean alienWordPresent(String alienWord) {
		for (WordEnhanced w:words) {
			if (w.getAlienWord().equals(alienWord))
				return true;
		}
		return false;
	}

}
