import java.util.*;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("banana");
        list.add("grapes");
        list.add("orange");
        Collections.sort(list);
        for(String fruits:list){
            System.out.println(fruits);
        }
        System.out.println("Sorting numbers");
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(105);
        list1.add(89);
        list1.add(15);
        list1.add(2);
        Collections.sort(list1);
        for(Integer Numbers:list1){
            System.out.println(Numbers);

        }

    }
}
