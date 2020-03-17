package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List <Word> words;
	
	public AlienDictionary() {
		words=new ArrayList<> ();
	}
	
	public void addWord (Word w) {
		if (words.contains(w) == false)
		    this.words.add(w);
		else {
			words.remove(w);
			words.add(w);
		}
			 
	}
	
	public String translateWord (String alienWord) {
		for (Word w:words) {
			if (w.getAlienWord().equals(alienWord))
				return w.getTranslation();
		}
		return null;
	}

}
