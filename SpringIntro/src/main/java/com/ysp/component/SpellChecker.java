package com.ysp.component;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	public void checkSpellingMistake(String document) {
		System.out.println("Spell checker executed for "+ document);
	}
}
