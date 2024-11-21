package lavanya;

public class methodoverloading1 {
	static void boo() {
		System.out.println("very good morning bro!");
	}
	static void boo(int a) {
		System.out.println("very good morning " + a + " sister");
	}

	public static void main(String[] args) {
		boo();
		boo(2000);

	}

}
