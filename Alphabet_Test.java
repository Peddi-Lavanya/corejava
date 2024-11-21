public class Alphabet_Test {
    public static void main(String[] args) {
        char c;
        for(c='A';c<='Z';c++){
            if(c%2!=0){
                System.out.print(c);
            }else{
                System.out.print((char)(c+32));
            }
        }
    }
}
