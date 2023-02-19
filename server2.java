import java.net.*;
import java.io.*;

public class server2{
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        int arr[] =(int[])ois.readObject();
        int sum = arr[0] + arr[1];
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println(sum);
        ps.flush();
    }
}