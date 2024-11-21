import java.util.*;
public class Arraylist_setget {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<String>();
        list.add("Mango");
        list.add("orange");
        list.add("grapes");
        list.add("banana");
        System.out.println(list.get(2));
        list.set(1,"apple");
        for(String fruit:list);
        System.out.println(fruit);
    }
}
