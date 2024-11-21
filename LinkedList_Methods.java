import java.util.*;
public class LinkedList_Methods {
    public static void main(String args[]){
        LinkedList<String>list=new LinkedList<String>();
        list.add("Ravi");
        list.add("lava");
        list.add("abby");
        list.add("abby");
        Iterator<String>itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list.pop());//1st value
        list.push("krishna");//
        System.out.println(list);
        list.add(1,"ravali");
        System.out.println(list);
        LinkedList<String> list1=new LinkedList<String>();
        list1.add("krisna");
        list1.add("Radha");
        list.addAll(list1);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.removeFirstOccurrence("abby"));
        System.out.println(list.removeLastOccurrence("abby"));
        System.out.println(list.set(1,"nana"));
        list.remove("abby");
        System.out.println(list);
       /* list.addAll(0,list1);
        System.out.println(list);
        list.addFirst("Radha");
        System.out.println(list);
        list.addLast("durga");
        System.out.println(list);
        list.clone();
        System.out.println(list);
        Iterator<String>descendingIterator=list.iterator();
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.contains("Abby");
        System.out.println(list);
        list.contains("baby");
        System.out.println(list);
        Iterator itr1=list.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println(list.element());
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("lava"));
        System.out.println(list.lastIndexOf("abby"));
        ListIterator<String>li=list.listIterator(4);
        while(li.hasNext()){
            System.out.println(li.next());
        }
        list.offer("red");//adds the value to the list
        System.out.println(list);
        list.offerFirst("manu");//adds the value in 1st
        System.out.println(list);
        list.offerLast("blue");//adds the valuie in the last
        System.out.println(list);
        System.out.println(list.peek());//removes the 1st value nd print
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.poll());//removes the 1st value nd print
        System.out.println(list.pollFirst());//removes the 1st value nd print
        System.out.println(list.pollLast());//removes the last value nd print
        System.out.println(list.pop());
        list.push("krishna");//it comes to the 1st possition
        System.out.println(list);*/
        
    }
}
