package lavaproject;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("lava");
		System.out.println(sb);
		//char at index 0
		System.out.println(sb.charAt(0));
		//set char at index
		//sb.setCharAt(0,'p');
		//System.out.println(sb);
		sb.insert(0,'s');
		System.out.println(sb);
		//delete
		sb.delete(0,1);
		System.out.println(sb);
	}

}
