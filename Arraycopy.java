public class Arraycopy {
   public static void main(String[] args) {
    int arr1[]={12,34,56,23,89,67};
    int arr2[]=new int[]{12,34,56,23,89,67};
    System.arraycopy(arr1,0,arr2,0,4);
    for(int n:arr2)
    System.out.print(n+",");
   } 
}
