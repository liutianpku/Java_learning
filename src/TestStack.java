import java.util.*;
public class TestStack {
	static String[] months = { 
		"January", "February", "March", "April",
		"May", "June", "July", "August", "September",
		"October", "November", "December" };
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		for(int i = 0; i < months.length; i++)
			stk.push(months[i] + " ");
		System.out.println("stk = " + stk);
		System.out.println("popping elements:");
		while(!stk.empty())
			System.out.println(stk.pop());
	}
}