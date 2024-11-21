package lavaproject;

public class String1 {

	public static void main(String[] args) {
		//concatenation
		String firstName="peddi";
		String lastName="lavanya";
		String fullName= firstName+ " "+lastName;
		System.out.println(fullName);
		System.out.println(fullName.length());
		//charAt
		for(int i=0;i<fullName.length();i++) {
			System.out.println(fullName.charAt(i));
		}
	}

}
