package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates1 {

	public static void main(String[] args) {
		String input="We learn java basics as part of java sessions in java week1";
		char[] charArray=input.toCharArray();
		Set<Character> output=new LinkedHashSet<Character>();
        for (int i = 0; i < charArray.length; i++) {
        	output.add(charArray[i]);
        }
			System.out.println(output);
		

	}

}
