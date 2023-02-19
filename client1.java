import java.net.*;
import java.io.*;

public class client1{
    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",5999);
        // OutputStream os = s.getOutputStream();
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String Date = br.readLine().toString();
        System.out.println("Date And Time : "+Date);
        is.close();
    }
}