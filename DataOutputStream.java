import java.io.*;
public class DataOutputStream {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("data.txt");
        DataOutputStream dout=new DataOutputStream(fout);
        dout.writeInt(65);
        dout.flush();
        dout.close();
        fout.close();
        System.out.println("Sucess");

    }

    
}
