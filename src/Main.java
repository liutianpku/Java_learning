
import java.util.Arrays;
import java.util.Scanner;

/*replace "Main" with file name before you compile and run it*/
public class Main {
	public int f(char a) {
		int trans[]= {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9};
	    if(a>='0'&&a<='9') return a-'0';
	    if(a>='a'&&a<='z') return trans[a-'a'];
	    if(a>='A'&&a<='Z') return trans[a-'A'];
	    else return 0;
	}
	public Main() {}
	public static void main(String [] args) { 
		int num[]=new int[100005];
		Main aaa = new Main();
        Scanner cin = new Scanner(System.in); 
        int n = cin.nextInt();
        for(int i=0;i<n;i++) {
        	String ss = cin.next();
        	int len = ss.length();
        	
        	for(int j=0;j<len;j++) {
        		char tmp = ss.charAt(j);
        		if(tmp!='-') {
        			num[i] = num[i]*10 + aaa.f(tmp);
        		}
        	}
        }
        Arrays.sort(num,0,n);
//        for(int i=0;i<n;i++) {
//        	for(int j=i;j<n;j++) {
//        		if(num[i]>num[j]) {
//        			int temp = num[i];
//        			num[i] = num[j];
//        			num[j] = temp;
//        		}
//        	}
//        }
        boolean flag = false;
        int cnt = 1;
        for(int i=0;i<n;i++) {
        	while(num[i]==num[i+1] && i+1<n) {
        		flag = true;
        		cnt++;
        		i++;
        	}
        	
        	if(cnt>1) {
        		System.out.printf("%03d-%04d %d\n",num[i]/10000,num[i]%10000,cnt);
        	}
        	cnt = 1;
        }
        if(!flag)
        	System.out.printf("No duplicates.\n");
	}
}
