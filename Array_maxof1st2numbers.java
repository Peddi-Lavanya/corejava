public class Array_maxof1st2numbers {
    public static void main(String[] args) {
        int arr[]={10,6,34,56,23,87};
        int max1=arr[0];
        int max2=arr[1];
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            if(max2<arr[i] && max1>arr[i] ){
                max2=arr[i];
            }
        }
         System.out.println(max1);
         System.out.println(max2);
        
    
    }
}
