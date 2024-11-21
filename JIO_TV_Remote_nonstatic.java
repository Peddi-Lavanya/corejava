public class JIO_TV_Remote_nonstatic {
   static String networkname="JIO";
   int powermode=0,volume=10,channel=100, lastwatched=100,temp ;  
   static String getnetwork_name(){
      return networkname;
   }
   void power(){
    if(powermode==0){
        powermode=1;
    }
    else{
        powermode=0;
    }
   }
   void increase_volume(){
    if(volume<100 && powermode==1){
        volume++;
     }
    System.out.println("increase_volume is="+volume);
   }
   void decrease_volume(){
    if(volume>0 &&powermode==1){
        volume--;
        System.out.println("decrease_volume is="+volume);
    }
   }
   void next_channel(){
    if(channel<400 && powermode==1){
        lastwatched=channel;
        channel++;
    }
    System.out.println("nextchannel="+channel);
   }
   void previous_channel(){
    if(channel>0 &&powermode==1){
        lastwatched=channel;
        channel--;
    }
    System.out.println("previous_channel="+channel);
   }
   void back(){
    int temp;
    temp=lastwatched;
    lastwatched=channel;
    channel=temp;
    System.out.println("lastwatched channel="+channel);
   }
   void change_channel(int number){
    if(number>=0 && number<=400){
        lastwatched=channel;
        channel=number;
        System.out.println("channel="+channel);
    }else{
        System.out.println("Invalid channel number");
    }
}
    void muteUnmute(){
        if(volume!=0){
            temp= volume;
            volume=0;
            System.out.println("mute="+volume);
        }else{
            volume=temp ;
            System.out.println("unmute="+volume);
        }
    }
   }

class Test_Remote{
public static void main(String args[]){
         JIO_TV_Remote_nonstatic r1=new JIO_TV_Remote_nonstatic(); 
            System.out.println(JIO_TV_Remote_nonstatic.getnetwork_name());
            r1.power();
            r1.power();
            r1.power();
            r1.increase_volume();
            r1.decrease_volume();
            r1.next_channel();
            r1.previous_channel();
            r1.back();
            r1.change_channel(386);
            r1.muteUnmute();

}
}
