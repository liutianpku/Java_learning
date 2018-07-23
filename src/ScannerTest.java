import java.util.Scanner;
import java.io.*;
public class ScannerTest {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = scanner.nextInt();
		System.out.printf("%d的平方是%d\n",a,a*a);
		/************************************************/
		 Scanner sc = new Scanner(System.in); 
	     System.out.println("请输入你的姓名："); 
	     String name = sc.nextLine(); 
	     System.out.println("请输入你的年龄："); 
	     int age = sc.nextInt(); 
	     System.out.println("请输入你的工资："); 
	     float salary = sc.nextFloat(); 
	     System.out.println("你的信息如下："); 
	     System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
		/************************************************/
		char c = ' ';
		System.out.print("Please input a char:");
		try {
			c = (char) System.in.read();
		}catch(IOException e) {}
		System.out.println("You have entered:"+c);
		/************************************************/
		String s1 = "";
		System.out.print("Please input a line: ");
		try{
			BufferedReader in = new BufferedReader(
				new InputStreamReader( System.in ) );
			s1 = in.readLine();//在java中，next()方法是不接收空格的，在接收到有效数据前，
			s1 = in.readLine();//所有的空格或者tab键等输入被忽略，若有有效数据，则遇到这些键退出。
		}catch(IOException e){}//nextLine()可以接收空格或者tab键，其输入应该以enter键结束。
		System.out.println("You have entered: " + s1 );
		/************************************************/
		String s = "";
		int n = 0;
		double d = 0;
		try{
			BufferedReader in = new BufferedReader(
				new InputStreamReader( System.in ) );
			System.out.print("Please input an int: ");
			s = in.readLine();
			n = Integer.parseInt( s );
			System.out.print("Please input a double: ");
			s = in.readLine();
			d = Double.parseDouble( s );
		}catch(IOException e){}
		System.out.println("You have entered: " + n + " and " + d );
	}
}

