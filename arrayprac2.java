package lavanya;

public class arrayprac2 {

	public static void main(String[] args) {
		int[] arr = {1,24,35,4,5,6};
		int L=arr.length;
		int n= Math.floorDiv(1,2);
		int temp;
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[L-i-1];
			arr[L-i-1]=temp;
		}
		
		for(int element: arr) {
			System.out.print(element+" ");
		}

	}

}
