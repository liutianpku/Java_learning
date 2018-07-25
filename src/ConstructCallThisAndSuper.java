class ConstructCallThisAndSuper 
{
	public static void main(String[] args){ 
		Person1 p = new Graduate();
	}
}

class Person1
{
	String name; 
	int age;
	Person1(){}
	Person1( String name, int age ){
		this.name=name; this.age=age; 
		System.out.println("In Person1(String,int)");
	}
}

class Student extends Person1
{
	String school;
	Student(){
		this( null, 0, null );
		System.out.println("In Student()");
	}
	Student( String name, int age, String school ){
		super( name, age );
		this.school = school;
		System.out.println("In Student(String,int,String)");
	}
}

class Graduate extends Student
{
	String teacher="";
	Graduate(){
		//super();
		System.out.println("In Graduate()");
	}
}