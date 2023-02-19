import java.net.*;
import java.io.*;

public class server1{
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println(java.time.LocalDateTime.now());
        ps.flush();
    }
}