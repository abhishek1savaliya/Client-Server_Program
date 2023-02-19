import java.io.*;
import java.net.*;
public class server4 {
    public static void main(String[] args) throws Exception {
           
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        System.out.println(s);
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String Str = br.readLine();
        System.out.println(Str);


    }
    
}
