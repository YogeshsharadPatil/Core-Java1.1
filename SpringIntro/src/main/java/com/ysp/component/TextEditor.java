package com.ysp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //if u do not provide id the Spring will give id as classname but first letter small
public class TextEditor {
	@Autowired
	private SpellChecker sp ;
	public void load(String document) {
		System.out.println("TextEditor Loaded " + document);
		sp.checkSpellingMistake(document);
	}
}
