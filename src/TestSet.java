import java.util.*;
class TestSet
{
	public static void main( String[] args){
		Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		set.add("Brazil");
		set.add("Russia");
		set.add("India");
		set.add("China");
		set.add("South Africa");

		System.out.println( set.contains("China") );

		for( String obj : set )
			System.out.println( obj );

	}
}