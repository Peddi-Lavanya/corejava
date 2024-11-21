import java.util.*;
public class ArrayList_Ex1 {
    public static void main(String args[]){
        //using normal flow:-
        /*ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("dates");
        System.out.println(list);*/
        //using iterator:-
     /*  ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("dates");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        //using foreach loop

       /*ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("dates");

        for(String fruits:list){
            System.out.println(fruits);
        }*/

        //using set nd get:-

       /* ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("dates");
        System.out.println(list.get(1));
        list.set(1,"Orange");
        System.out.println(list);
        for(String fruits:list){
            System.out.println(fruits);
        }*/


        //using sorting ArrayList:-
        /*ArrayList<String>list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        Collections.sort(list);
        for(String fruits:list){
            System.out.println(fruits);
        }
        System.out.println("Sorting numbers");
        ArrayList<Integer>list1=new ArrayList<Integer>();
        list1.add(56);
        list1.add(152);
        list1.add(46);
        list1.add(564);
        Collections.sort(list1);
        System.out.println(list1);
        for(Integer numbers:list1){
            System.out.println(numbers);
        }*/

        //using list iterator:-
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("dates");
        System.out.println("using ListIterator");
        ListIterator<String>list1=list.listIterator(list.size());
        while(list1.hasPrevious()){
            System.out.println(list1.previous());
        }
        System.out.println("using forLoop");
        for(int i=0;i<=list.size();i++){
            System.out.println(list.get(i));
        }
    

        
    }
}
