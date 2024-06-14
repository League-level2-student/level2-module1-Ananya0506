package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> letters = new ArrayList<String>();
		//2. Add five Strings to your list
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		letters.add("E");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<5; i++) {
			String s = letters.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : letters) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
System.out.println(letters.get(0));
System.out.println(letters.get(2));
System.out.println(letters.get(4));
		//6. Print all the Strings in reverse order.
for(int i = 4; i>=0; i--) {
	String s = letters.get(i);
	System.out.println("String at element " + i + " " + s);
}
		//7. Print only the Strings that have the letter 'e' in them.
System.out.println(letters.get(4));
	}
}
