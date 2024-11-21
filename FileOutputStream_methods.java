import java.io.*;
public class FileOutputStream_methods {
    public static void main(String args[]){
       /* try{
            FileOutputStream fos=new FileOutputStream("file.txt");
        fos.write(65);
        String name="Welcome to files concept";
        byte arr[]=name.getBytes();
        fos.write(arr);
        fos.write(arr,2,name.length()-2);
        

        fos.close();
        System.out.println("sucess");
        }
        catch(Exception e){
            System.out.println(e);
        }*/

        try{
            FileInputStream fis=new FileInputStream("file.txt");
            fis.available();
            int i=fis.read();
            System.out.print((char)i);
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.skip(56);
            System.out.println((char)i);
            byte arr[]=new byte[100];
            fis.read(arr);
            for(byte j:arr)
            System.out.print((char)i);

            fis.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
