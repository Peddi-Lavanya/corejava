package lavanya;

public class Stringmethods {

	public static void main(String[] args) {
		String name="Lavanya";
	    int value=name.length();
	    System.out.println(value);
	    String lstring=name.toLowerCase();
	    System.out.println(lstring);
	    String ustring=name.toUpperCase();
	    System.out.println(ustring);
	    //String nontrimmedstring="      Lavanya       ";
	    //System.out.println(nontrimmedstring);
	    //String trimmedstring=nontrimmedstring.trim();
	    //System.out.println(trimmedstring);
	    System.out.println(name.substring(3));
	    System.out.println(name.substring(2));
	    System.out.println(name.substring(1,6));
	    System.out.println(name.replace('a','n'));
	    System.out.println(name.replace("a","lra"));
	    System.out.println(name.startsWith("Lav"));
	    System.out.println(name.startsWith("paav"));
	    System.out.println(name.endsWith("nya"));
	    System.out.println(name.endsWith("Lav"));
	    System.out.println(name.startsWith("Lav"));
	    System.out.println(name.charAt(0));
	    System.out.println(name.indexOf("n"));
	    System.out.println(name.indexOf("a",2));
	    System.out.println(name.indexOf("a",4));
	    System.out.println(name.lastIndexOf("a"));
	    System.out.println(name.lastIndexOf("a",4));
	    System.out.println(name.equals("Lavanya"));
	    System.out.println(name.equals("lavanya"));
	    System.out.println(name.equalsIgnoreCase("lAvANya"));
	    System.out.println("my name is lavaa\"double spaces");
	    System.out.println("my name is lavaa\\double spaces");
	    System.out.println("my name is lavaa\n double spaces");
	    System.out.println("my name is lavaa\t double spaces");
	    }

}
