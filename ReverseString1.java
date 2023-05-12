package week3.day2;

import java.util.Iterator;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="Iam a Software Engineer";
		char[] ch=input.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
	}

}
