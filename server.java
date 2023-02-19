import java.net.*;
import java.io.*;
import java.util.*;

public class server{
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        int arr[] =(int[])ois.readObject();

        Arrays.sort(arr);

        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(arr);
        
        oos.flush();
        os.close();
        s.close();
       



    }
}
