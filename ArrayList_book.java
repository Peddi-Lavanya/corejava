import java.util.*;
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    Book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
    public String toString(){
        return name+" "+publisher;
    }
}
public class ArrayList_book {
    public static void main(String args[]){
        ArrayList<Book>list=new ArrayList<>();
    Book b1=new Book(12,"c","yashwanth","bpb",6);
    Book b2=new Book(15,"python","pratab","jm",8);
    Book b3=new Book(19,"java","shankar","bjp",9);
    list.add(b1);
    list.add(b2);
    list.add(b3);
    for(Book b:list){
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        System.out.println(list); 0
    }
    }
}
