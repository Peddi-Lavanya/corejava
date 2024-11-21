package lavanya;

public class stringpac {

	public static void main(String[] args) {
		String name="Lavanya";
		name=name.toLowerCase();
		System.out.println(name);
		String text="Lavanya is a student of Loyola academy";
		text=text.replace(" ", "_");
		System.out.println(text);
		String letter="Dear ,<|name|>,Thanks a lot";
		letter=letter.replace("<|name|>", "Lavanya");
		System.out.println(letter);
		String myString="lavaa dont have any  friends..she gave up easily!";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		String myLetter="Dear lava,\n\tYou look beautiful.\nThanks!";
		System.out.println(myLetter);
		}

}