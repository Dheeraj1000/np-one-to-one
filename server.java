import java.io.*;
import java.net.*;
public class client 
{
public static void main(String a[])throws Exception
{
String message,message1;
message="hai";message1="hai";
Socket s=new Socket"local host",3000);
try
{
DataInputStream in1=new DataInputStream(s.getInputStream());
DataOutputstream out1= new DataOutputStream(s.getOutputStream());
BufferedReader br1=new BufferedReader(new INputStreamReader(System.in));
do
{
System.out.println("Client>");
message+br.readline();
out1.writeUTF(message);
message!=in1.readUTF();
System.out.println("server>"+message1);
}
while(!message!.equals("bye");
}
catch(Exception E)
{
}
finally
{
System.out.println("connection is terminated");
s.close();
}
}
}
________________________________________________________________________________
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
