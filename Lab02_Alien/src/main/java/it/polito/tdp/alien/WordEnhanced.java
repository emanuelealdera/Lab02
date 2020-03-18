package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private List <String> translations;
	
	public WordEnhanced (String alienWord, String translation) {
		this.alienWord=alienWord;
		translations = new ArrayList <> ();
		translations.add(translation);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public List <String> getTranslation() {
		return translations;
	}
	
	public String translationsToString() {
		String str="";
		for (String s:translations)
			str += s+"\n";
		return str;
	}

	public void setTranslation(String translation) {
		this.translations.add(translation);
	}
	
	

}
