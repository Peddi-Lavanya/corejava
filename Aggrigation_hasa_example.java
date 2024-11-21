class Address{
  String city;
  String state;
  String country;
   Address(String city,String state,String country){
    this.city=city;
    this.state=state;
    this.country=country;
   }
}
class Emp{
    int id;
    String name;
    Address address;

    Emp(int id,String name,Address address){
    this.id=id;
    this.name=name;
    this.address=address;
}
void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city +" "+address.state+" "+address.country);
}
}


public class Aggrigation_hasa_example {
    public static void main(String[] args) {
        Address a1=new Address("hyderabad","telangana","india");
        Address a2=new Address("gno","up","india");

        Emp e1=new Emp(111,"lavanya","a1");
        Emp e2=new Emp(122,"Abby","a2");
        e1.display();
        e2.display();

    }

}
