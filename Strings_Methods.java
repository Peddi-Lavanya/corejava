public class Strings_Methods {
    public static void main(String[] args) {
     /*String name=new String("Tech learn");
        //Static way to declare a string
        String name1="Lavanya";
        //Dynamic way to declare a String
        String name2=new String("bhavani");*/
      //1.equals method:
    /*String s1="Tech learn", s2="Tech learn";
      String s3=new String("Tech");
      String s4=new String("Tech learn");
      System.out.println(s1.equals(s2));
      System.out.println(s3.equals(s4));
      System.out.println(s1.equals(s3));*/
    //2.compareTo method:-
    /*String s1="abc";
    String s2="abcde";
    System.out.println(s1.compareTo(s2));*/
   //3.double equalTo method:-
   /*String s1="Tech learn", s2="Tech learn";
      String s3=new String("Tech");
      String s4=new String("Tech learn");
      System.out.println(s1==s2);
      System.out.println(s3==s4);
      System.out.println(s1==s3);*/
    //4.contains method:-
      /*String s1="Tech learn";
      String s2="Tech";
      System.out.println(s1.contains(s2));
      String s3="lavanya";
      System.out.println(s1.contains(s3));*/
    //5.Substring method:-
    /*String s1="Tech learn";
    String s2="Lavanya";
    int l=s1.length();
    System.out.println(s1.substring(4));
    System.out.println(s1.substring(0,5));
    System.out.println(s1.substring(l-3));
    System.out.println(s1.substring(l-2));*/

    //6.concatination method:-
 /*String s1="Lava";
 String s2="Abby";
 System.out.println(s1.concat(s2));
 System.out.println(s1);
 s1=s1.concat(s2);
 System.out.println(s1);
 System.out.println(s1+s2);
 String s3=s1+s2;
 System.out.println(s3);*/

 //7.Uppercase:-
 //8.Lower case:-
 //9.Replace
 /*String s1="Lavanya";
 System.out.println(s1.toUpperCase());
 System.out.println(s1.toLowerCase());
System.out.println(s1.replace("Lava","Abby"));*/
//10.CharAt:-
/*String str="Lavanya";
System.out.println(str.charAt(0)==0);
char arr[][]=str.toCharArray();
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+",");
}*/

//11.Split method:-
String A="Tech learn solutions";
String arr[][]=A.split(" ");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+",");
}




    }
}
