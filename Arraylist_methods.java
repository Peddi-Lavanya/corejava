/*import java.util.*;
public class Arraylist_methods {
    public static void main(String args[]){
     ArrayList<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("c");
        list.add("D");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.set(1,"lavanya"));
        ArrayList<String> nameStartsWithLetterA=new ArrayList<String>();
        nameStartsWithLetterA.add("Ahmed");
        nameStartsWithLetterA.add("hman");
        nameStartsWithLetterA.add("ebdul");
           System.out.println(nameStartsWithLetterA);
           System.out.println(list.addAll(nameStartsWithLetterA));
           System.out.println(list);
           System.out.println(list.remove(1));
           System.out.println(list.removeAll(nameStartsWithLetterA));
           //System.out.println(list.sort(nameStartsWithLetterA));
            //System.out.println(list.retainAll("Ahmed"));
          // System.out.println(list.replaceAll(1,"lava"));
          //System.out.println(list.removeRange(1,3));*/

           //ArrayList iterator:-
        /*ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        System.out.println(list);
        System.out.println(list.lastIndexOf(3));
        System.out.println(list.indexOf(3));
        System.out.println(list.clone());
        System.out.println(list.contains("a"));
        System.out.println(list.remove(3));
        System.out.println(list);
        Iterator<String> itr=list.listIterator(3);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
    import java.util.*;
        public class Arraylist_methods extends ArrayList<String> {//extends for removeRange and class name is written in place of ArrayList
         public static void main(String args[]){
        Arraylist_methods list=new Arraylist_methods();
        list.add("Lavanya");
        list.add("Abby");
        list.add("Eshwar");
        list.add("Lavanya");
        System.out.println(list);
        Arraylist_methods list1=new Arraylist_methods();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list1);
        list1.ensureCapacity(10);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.indexOf("Lavanya"));
        System.out.println(list.lastIndexOf("Lavanya"));
        System.out.println(list.remove("Abby"));
        list.removeRange(1,3);//for remove range we need to extends arraylist
        System.out.println(list);
        list.replaceAll(e->"Abby");
        System.out.println(list);
        list.removeIf(e->e.length()<=7);
        System.out.println(list);
        System.out.println(list.retainAll(list1));
        Collections.sort(list1);
        System.out.println(list1);



       
    }
}
