public class Static_Screen {
    static int powermode=0,length,width;
    static void power(){
      if(powermode==0){
        powermode=1;
      }else{
        powermode=0;
        System.out.println("powermode="+powermode);
      }
      }
      static void increase_length(){
        if(length<40 && powermode==1){
            length++;
        }
        System.out.println("increase_length="+length);
      }
      static void decrease_length(){
        if(length>40 && powermode==1){
          length--;
        }
        System.out.println("decrease_length="+length);
      }
      static void increase_width(){
          if(width<3 && powermode==1){
            width++;
        }
        System.out.println("increase_width="+width);
        }
        static void decrease_width(){
          if( width<39 && powermode==1){
            width--;
          }
          System.out.println("decrease_width="+width);
        }
}
class test_Screen{      
public static void main(String args[]){
        Static_Screen .power();
        Static_Screen.increase_length();
        Static_Screen.decrease_length();
        Static_Screen.increase_width();
        Static_Screen.decrease_width();
          
      }
}

