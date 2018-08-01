import java.util.*;
class TestCollectionsSortByLambda
{
	public static void main(String[] args) 
	{
		List<Persontcsl> school = new ArrayList<>();
		school.add( new Persontcsl("Li",23));
		school.add( new Persontcsl("Wang",28));
		school.add( new Persontcsl("Zhang",21));
		school.add( new Persontcsl("Tang",19));
		school.add( new Persontcsl("Chen",22));
		school.add( new Persontcsl("Zhao",22));
		System.out.println( school );
		
		Collections.sort( school, (p1,p2)->p1.age-p2.age );
		System.out.println( school );

		int index = Collections.binarySearch( 
				school, new Persontcsl("Li",23), (p1,p2)->p1.age-p2.age );
		if( index >=0 ) 
			System.out.println( "Found:" + school.get( index ));
		else
			System.out.println( "Not Found!" );
	}
}

class Persontcsl
{
	String name;
	int age;
	public Persontcsl( String name, int age){ 
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+":"+age;
	}
}


