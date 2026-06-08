import java.io.*;
public class Demo14 {
  public static void main(String[] args) throws IOException{
    //BufferReader

    InputStreamReader isr = new InputStreamReader(System.in);
    
    BufferedReader br = new BufferedReader(isr);

    String name = br.readLine();

    System.out.println(name);

    /*
    work flow here
    1.Aditya --i/p
    2.OS Buffer (65,100,116,121,97)
    3.System.in (InputStream) recieves bytes
    4.InputStreamReader --> stream of bytes into stream of characters
     ('a','d','i','t','y','a')
     5. BufferedReader -- readLine -- Aditya --name
     6.Aditya --o/p
     */
    
  }
}
