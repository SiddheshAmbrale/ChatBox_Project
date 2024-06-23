import java.net.*;
import java.io.*;

class Client
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client Application is running ");


        Socket sobj=new Socket("localhost",2100);
        System.out.println("Server  gets succesfully connected..");
        PrintStream ps =new PrintStream(sobj.getOutputStream());
        BufferedReader br1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;

        System.out.println("Marvellous messanger started..");

        while(!(str1=br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2=br1.readLine();
            System.out.println("Enter message for server :");
            System.out.println("Server says  :"+str2);
        }
        System.out.println("Thanks for using Marvellous");
    }
}