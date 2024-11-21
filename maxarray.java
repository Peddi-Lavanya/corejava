package lavanya;

public class maxarray {

	public static void main(String[] args) {
		int[]arr= {1,456,300,20,5};
		int max=0;
		for(int element:arr) {
			if(element>max) {
				max=element;
			}
		}
  System.out.println("The maximum value of the array is"+max);
	}

}
