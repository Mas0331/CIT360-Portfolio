package tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class JunitTesting {
	
	public int square(int x) {  //For int x, return the int squared by itself
		return x * x;
	}
	
	
	public int countA(String word) {
		int count = 0;										//this starts our counter at the first letter of the string
		for(int i = 0; i < word.length(); i++) {			//this makes sure our loop stops after the last letter
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){	//just in case the user puts a capital A at the beginning
				count++;									//go to the next character in the string
			}
		}
		return count;
	}
	
	public boolean areFirstLastSame(String str) {
		if (str.length() <=1)
			return false;
		if (str.length() == 2)
			return true;
		
		String first2Chars = str.substring(0, 2);
		
		String last2Chars = str.substring(str.length() - 2);
		
		return first2Chars.equals(last2Chars);
		
	}
}
