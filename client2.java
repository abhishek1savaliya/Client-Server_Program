import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client2{
    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",5999);
        OutputStream os = s.getOutputStream();
        Scanner input = new Scanner(System.in);
        int arr[] = new int[2];
        System.out.println("Enter the 2 Number:");
               arr[0] = input.nextInt();
               arr[1] = input.nextInt();
               
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(arr);

        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String sum = br.readLine().toString();
        System.out.println("SUM : "+sum);
        oos.flush();
        os.close();
    }
}