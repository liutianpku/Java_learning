class ConstructorInvokeVirtual 
{
	public static void main(String[] args){ 
		Person3 p = new Student2("Li Ming", 18, "PKU");
	}
}

class Person3
{
	String name="未命名"; 
	int age=-1;
	Person3( String name, int age ){
		this.name=name; this.age=age; 
		sayHello();
	}
	void sayHello(){
		System.out.println( "A Person, name: " + name + ", age: "+ age );
	}
}

class Student2 extends Person3
{
	String school="未定学校";
	Student2( String name, int age, String school ){
		super( name, age );
		this.school = school;
	}
	void sayHello(){
		System.out.println( "A Student, name:" + name + ", age: "+ age + ", school: " + school );
	}
}

