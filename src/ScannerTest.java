import java.util.Scanner;
import java.io.*;
public class ScannerTest {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int a = scanner.nextInt();
		System.out.printf("%d��ƽ����%d\n",a,a*a);
		/************************************************/
		 Scanner sc = new Scanner(System.in); 
	     System.out.println("���������������"); 
	     String name = sc.nextLine(); 
	     System.out.println("������������䣺"); 
	     int age = sc.nextInt(); 
	     System.out.println("��������Ĺ��ʣ�"); 
	     float salary = sc.nextFloat(); 
	     System.out.println("�����Ϣ���£�"); 
	     System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"���ʣ�"+salary);
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
			s1 = in.readLine();//��java�У�next()�����ǲ����տո�ģ��ڽ��յ���Ч����ǰ��
			s1 = in.readLine();//���еĿո����tab�������뱻���ԣ�������Ч���ݣ���������Щ���˳���
		}catch(IOException e){}//nextLine()���Խ��տո����tab����������Ӧ����enter��������
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

