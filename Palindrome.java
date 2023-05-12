package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String value ="madam";
			String rev = "";
			for (int i = value.length()-1; i >=0; i--) {
				rev = rev + value.charAt(i);
				}
			System.out.println(rev);
			if(value.equals(rev));
			System.out.println("The given word is Palindrome");
		
	}

}
