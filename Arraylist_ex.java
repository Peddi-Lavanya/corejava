import java.util.ArrayList;
public class Arraylist_ex {
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<String>();
        list.add("Lavanya");
        list.add("Abby");
        list.add("Manoj");
        list.add("EShwar");
       System.out.println(list);
       ArrayList<String> words=new ArrayList<String>();
       words.add("A");
       words.add("B");
       words.add("C");
       words.add("D");
       System.out.println(words);
       System.out.println(list.addAll(words));
       System.out.println(list);

       /*ArrayList<Integer> numbers=new ArrayList<Integer>();
       numbers.add(52);
       numbers.add(25);
       numbers.add(31);
       numbers.add(5);
       System.out.println(numbers);
       ArrayList<Integer> number1=new ArrayList<Integer>();
       number1.add(5);
       number1.add(6);
       System.out.println(number1);
       System.out.println(numbers.addAll(number1));
       System.out.println(numbers);*/
       
    }
}
