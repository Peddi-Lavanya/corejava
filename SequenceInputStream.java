import java.io.*;
public class SequenceInputStream {
    public static void main(String args[])throws Exception{
            FileInputStream input1=new FileInputStream("sequencein.txt");
            FileInputStream input2=new FileInputStream("sequenceout.txt");
            SequenceInputStream sis=new SequenceInputStream(input1,input2);
            int i;
            while((i=sis.read())!=-1){
            System.out.println((char)i);
            }
            sis.close();
            input1.close();
            input2.close();
    }

    
}
