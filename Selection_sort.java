public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={12,34,21,10,45,9},i,j,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("array elements after sorting:-");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
