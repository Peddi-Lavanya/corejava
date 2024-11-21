import java.util.*;
public class vector_methods {
    public static void main(String args[]){
   /* Vector<String>vec=new Vector<String>();
    vec.add("lava");
    vec.add("bhanu");
    vec.add("abby");
    vec.addElement("rat");
    vec.addElement("cat");
    vec.addElement("bat");
    System.out.println(vec);
    Vector<String>vec1=new Vector<String>();
    vec1.addElement("manu");
    vec1.add("cat");
    vec1.add("bat");
    System.out.println(vec1);
    vec1.addAll(vec);
    System.out.println(vec1);
    if(vec1.contains("lava")){
        System.out.println("lava is present at:-" +vec1.indexOf("bhanu"));
    }else{
        System.out.println("lava is not present in the array");
    }
    System.out.println(vec1.containsAll(vec));//all the strings or integers are present in the list it returns true if any one is not available it returns false
    System.out.println(vec1.elementAt(1));
    /*Enumeration<String>enu=vec1.elements();//elements method in vectors
    while(enu.hasMoreElements()){
        System.out.println(enu.nextElement());
    }
    System.out.println(vec1.capacity());

    vec1.ensureCapacity(20);
    System.out.println(vec1);
    System.out.println("is vec and vec1 are equal:-"+vec.equals(vec1));
    System.out.println(vec1.firstElement());
    vec1.get(5);
    System.out.println(vec1);
    vec1.forEach(System.out::println);
    vec1.hashCode();
    System.out.println(vec1);
    System.out.println(vec1.indexOf("bat"));
    vec1.insertElementAt("tatoo",2);
    System.out.println(vec1);
    System.out.println(vec1.isEmpty());
    vec1.lastIndexOf(6);
    System.out.println(vec1);*/
     


   /* vec1.clear();
    System.out.println(vec1);
    System.out.println(vec1.clone());
    vec1.containsAll(vec);
    System.out.println(vec1);*/

    //copyInto method():-
    /*Vector<Integer>v=new Vector<Integer>();
    v.add(5);
    v.add(52);
    v.add(32);
    v.add(89);
    Integer arr[]=new Integer[3];//if u want to write string u can integer wont accept so u will always get an exception
    v.copyInto(arr);
    for(Integer number:arr){
        System.out.println(number);
    }
    Vector<Integer>v1=new Vector<Integer>();
    v1.add(56);
    v1.add(20);
    v.addAll(v1);*/

        Vector<String>v=new Vector<String>();
        v.add("baby");
        v.add("lavaa");
        v.add("nanu");
        v.add("eshuu");
        /*String arr[]=new String[4];
        v.copyInto(arr);
        for(String temp:arr){
            System.out.println(temp);
        }*/
        Vector<String>v1=new Vector<String>();
         v1.add("granny");
         v1.add("papu");
        v.addAll(v1);
         System.out.println(v);
         System.out.println(v.remove((String)"granny"));
         boolean changed=v.removeAll(v1);
         if(changed){
            System.out.println("collection is removed");
         }else{
            System.out.println("collection is not remoeved");
            System.out.println(v);
         }
           System.out.println("final vector"+v);
           v.set(2,"tatoo");
           System.out.println(v);
           v.setElementAt("eshuu",2);
           System.out.println(v);
           v.setSize(4);
           System.out.println(v);
            Collections.replaceAll(v,"lavaa","lavanya");
            System.out.println(v);
            System.out.println(v.size());
             v.toArray();
            System.out.println(v);
            v.toString();
            System.out.println(v);
            v.trimToSize();
            System.out.println(v);
            Collections.sort(v);
            System.out.println(v);
            v.spliterator();
            System.out.println(v);
            System.out.println(v.retainAll(v1));
           
         
           v.removeIf(e->e.length()<=3);
           System.out.println(v);
           v.removeAllElements();
           System.out.println(v);
           
      



    }


}
