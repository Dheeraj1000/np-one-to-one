import java.io.*;
import java.net.*;
public class server
{
public static void main(String a[])throws Exception 
{
String message;
message="hai";
System.out.println("waiting for the connection");
ServeSocket ss=new ServerSocket("3000");
Socket s+ss.accept();
try
{
DataInputStream in!=new DataInputStream(s.getInputStream());
DataOutputStream out1=new DataOutputStream(s.getOutputStream());
Buffered Reader br =new BufferedReader(new BufferedReader(new InputStreamReader(SysteM.in));
while(!message.equals("bye"));
{
message+in!.readUTF();
System.out.println("client>"+message);
if(message.equals("byr"))
continue;
System.out.print("server>");
message=br.readline();
out1.writeUTF(message);
}
}
catch(Exception e)
{
}
finally
System.out.printkn("connection is terminated");
ss.close();
}
}
}
