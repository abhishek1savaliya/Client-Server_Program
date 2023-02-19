import java.io.*;
import java.net.Socket;
public class client4 {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",5999);
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("HELLO");
        ps.flush();
        s.close();
    }
}
