public class linear_search {
    public static void main(String[] args) {
        int arr[]={12,34,21,10,45,89,23},num,i;
        num=58;
        for(i=0;i<arr.length;i++){
            if(num==arr[i]){
                break;
            }
        }
            if(i<arr.length){
                System.out.println(num+"found at"+i+"index");
            }else{
                System.out.println(num+" not found");
            }
        
    }
}
