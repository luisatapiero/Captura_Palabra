import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;


public class Main extends PApplet {
	
	String[] texts;
	ArrayList<String>words;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}

	
	public void settings() {
		size (600,600);
		
	}


	public void setup() {
		ArrayList<String> words = new ArrayList<>();  
		background(255);
		texts = loadStrings("./assets/strings.txt");
		for (int i = 0; i < texts.length; i++) {
			String[] arrayWords = texts[i].split(" ");
			for (int j = 0; j < arrayWords.length; j++) {
				words.add(arrayWords[j]);
			}

				}
				
		for (int k = 0; k < words.size(); k++) {
			fill (0);
			textSize(12);
			text(words.get(k), random(20, 580), random(20, 580));
			System.out.println(words.get(k));
			}
		}
		

	public void draw() {
		
		
		
	}

}
