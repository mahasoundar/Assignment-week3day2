package week3.day2;

public class ChangeoddIndextoUppercase {
	public static void main(String[] args) {
		
	String value = "changeme";
	char[] ch=value.toCharArray();

	for (int i = 0; i < value.length(); i++) {
		ch[i] = value.charAt(i);
	}
	for (int j = 0; j < ch.length; j++) {
	if (j%2==0) {
		System.out.print(ch[j]);
	}
		else {
		System.out.print(Character.toUpperCase( ch[j] ));
		}
	}	
		
	}	
	}

