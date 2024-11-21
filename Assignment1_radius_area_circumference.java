import java.io.*;
public class File_ex {
    public static void main(String args[])throws IOException{
        FileOutputStream fos=new FileOutputStream("c://hello.txt");
        for(int i=65;i<=90;i++)
            fos.write(i);
            fos.close();
    
    }
}
