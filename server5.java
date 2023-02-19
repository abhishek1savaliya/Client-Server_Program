import java.io.*;
import java.net.*;
public class server5 {
    public static void main(String[] args) throws Exception {
           
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        if(s!=null){
           System.out.println("Server is connected to the client.");
           OutputStream os = s.getOutputStream();
           PrintStream ps = new PrintStream(os);
           ps.println("Conneted Successfully to the Server.");
           ps.flush();
           s.close();

        }
        else{
            System.out.println("Sever is not connected to the client.");
        }

      


    }
    
}