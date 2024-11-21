import java.util.*;
public class ArrayList_methods1 {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>();
        list.add("bhavani");
        list.add("lavanya");
        list.add("ravali");
        list.add("eshwar");
        list.add("ammu");
        System.out.println(list);
        list.remove("ammu");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        ArrayList<String>list1=new ArrayList<>();
        list1.add("chintu");
        list1.add("mintu");
        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list1);
        list.removeIf(a->a.contains("lavanya"));
        System.out.println(list);
        list.clear();
        System.out.println(list);


    }
}
