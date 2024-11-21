import java.io.*;
public class BufferOutputStream {
    public static void main(String args[])throws Exception{
        /*FileOutputStream fout=new FileOutputStream("buffer.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to buffer concept";
        byte arr[]=s.getBytes();
        bout.write(arr);
        bout.write(arr,5,s.length()-5);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Sucess");*/

        FileInputStream fir=new FileInputStream("buffer.txt");
        BufferedInputStream bis=new BufferedInputStream(fir);
        System.out.println(bis.available());
        int i=bis.read();
        System.out.println((char)i);
        
        bis.mark(19);
        System.out.println((char)i);
        bis.markSupported();
        System.out.println((char)i);
        bis.reset();
        System.out.println((char)i);
        int j;
        while((i=bis.read())!=-1){
            System.out.print((char)i);

        }
        bis.close();
        fir.close();
    }
}
