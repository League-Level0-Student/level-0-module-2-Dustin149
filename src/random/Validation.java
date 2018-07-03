//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;
import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		String[] Compliments = {"I like your clothes","You sure work hard","Nice shoes","Awesome job!"};
		
		System.out.println(randomNumber);
		
		for (int i=1;i<10;i++){
			int Num = randomMaker.nextInt(5);
			String Compliment = Compliments[Num];
		// 1. Use each value of randomNumber to give the user a random compliment.
			JOptionPane.showMessageDialog(null, Compliment);
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
