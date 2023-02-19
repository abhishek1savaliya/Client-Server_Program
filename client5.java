import java.io.*;
import java.net.Socket;
public class client5 {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",5999);

        
  InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String Str = br.readLine();
        System.out.println(Str);
       
    }
}
  
  
  
  