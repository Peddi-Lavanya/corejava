public class Arr1sthalf_sum {
    public static void main(String[] args) {
        int arr[]={10,6,32,14,65,26,37,88,29,70};
        int sum=0;
        for(int i=0;i<arr.length;i++){
              sum+=arr[i];
        }
        System.out.println("sum="+sum/5);
    }
}
