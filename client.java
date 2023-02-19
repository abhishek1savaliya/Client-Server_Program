import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client{
    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost",5999);
        OutputStream os = s.getOutputStream();
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter the 10 Number:");
        for(int i=0;i<arr.length;i++){
               arr[i] = input.nextInt();
        }
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(arr);
        oos.flush();

        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        int arr2[] =(int[])ois.readObject();
        System.out.println("Sorted Array: ");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

        os.close();
    }
}