import java.io.*;
import java.net.*;
public class server3 {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(5999);
        Socket s = ss.accept();
        
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = br.readLine();

        StringBuffer sb = new StringBuffer(str);
        String message;
        sb.reverse();
        String y = sb.toString();
        if(str.equals(y))
        {
             message = "Yes";
        }
        else
        {
             message = "No";
        } 
        System.out.println(message);

       OutputStream os = s.getOutputStream();
       PrintStream ps = new PrintStream(os);
       ps.println(message);
       ps.flush();
       

    }
}
