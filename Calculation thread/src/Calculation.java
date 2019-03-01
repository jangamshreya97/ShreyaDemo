import java.util.Scanner;

public class Calculation extends Thread {
String str[];

public Calculation(String[] str) {
	super();
	this.str = str;
}

public void addition()
{
	int sum=0;
	for(int i=0;i<str.length;i++)
	{
		sum=sum+Integer.parseInt(str[i]);
	}
	System.out.println("Addition is:"+sum);
}
public void run()
{	
	addition();
}

}
