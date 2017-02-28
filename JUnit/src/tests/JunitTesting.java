package tests;

public class JunitTesting {
	
	public int square(int x) {  //For int x, return the int squared by itself
		return x*x;
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
}
