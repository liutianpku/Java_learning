import java.util.Scanner;
import java.io.*;
public class ScannerTest {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = scanner.nextInt();
		System.out.printf("%d的平方是%d\n",a,a*a);
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
			s1 = in.readLine();
			s1 = in.readLine();
		}catch(IOException e){}
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

