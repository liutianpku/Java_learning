import java.util.*;
class TestCollectionsSort 
{
	public static void main(String[] args) 
	{
		List<Persontcs> school = new ArrayList<>();
		school.add( new Persontcs("Li",23));
		school.add( new Persontcs("Wang",28));
		school.add( new Persontcs("Zhang",21));
		school.add( new Persontcs("Tang",19));
		school.add( new Persontcs("Chen",22));
		school.add( new Persontcs("Zhao",22));
		System.out.println( school );
		
		Collections.sort( school, new PersonComparator() );
		System.out.println( school );

		int index = Collections.binarySearch( 
				school, new Persontcs("Li",23), new PersonComparator() );
		if( index >=0 ) 
			System.out.println( "Found:" + school.get( index ));
		else
			System.out.println( "Not Found!" );
	}
}

class Persontcs
{
	String name;
	int age;
	public Persontcs( String name, int age){ 
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString(){
		return name+":"+age;
	}
}

class PersonComparator implements Comparator
{
	public int compare( Object obj1, Object obj2 ){
		Persontcs p1 = (Persontcs)obj1;
		Persontcs p2 = (Persontcs)obj2;
		if( p1.age > p2.age ) return 1;
		else if(p1.age<p2.age) return -1;
		return p1.name.compareTo( p2.name );
	}
}

