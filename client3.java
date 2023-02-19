import java.net.*;
import java.io.*;

public class client3{
    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",5999);
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println("ABBA");
        ps.flush();
        
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str= br.readLine();
        
        if(str.equals("Yes")){
            System.out.println("This is Palindrome String");
        }
        else{
            System.out.println("This is not Palindrome String");
        }
        os.close();
    }
}