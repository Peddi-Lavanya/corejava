import java.io.*;
public class ByteArrayOutputStream {
    public static void main(String args[])throws IOException{
       FileOutputStream fos=new FileOutputStream("byteArray.txt");
        FileOutputStream fos1=new FileOutputStream("byteArray1.txt");
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fos);
        bout.writeTo(fos1);
        bout.flush();
        bout.close();
        fos.close();
        fos1.close();
        System.out.println("Sucess");

       /* byte[]arr={23,56,89,47,41};
        ByteArrayInputStream bai=new ByteArrayInputStream(arr);
        int i;
        while((i=bai.read())!=-1){
            System.out.println((char)i);
            System.out.println("Ascii valueis"+i+"Special character:"+(char)i);
        }*/
    }
}
