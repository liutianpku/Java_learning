class TestVirtualInvoke
{
	static void doStuff( Shape1 s ){
		s.draw();
	}

	public static void main( String [] args ){
		Circle1 c = new Circle1();
		Triangle1 t = new Triangle1();
		Line1 l = new Line1();
		doStuff(c);
		doStuff(t);
		doStuff(l);
	}
}
class Shape1
{
	void draw(){ System.out.println("Shape1 Drawing"); }
}
class Circle1 extends Shape1
{
	void draw(){ System.out.println("Draw Circle1"); }
}

class Triangle1 extends Shape1
{
	void draw(){ System.out.println("Draw Three Line1s"); }
}

class Line1 extends Shape1
{
	void draw(){ System.out.println("Draw Line1"); }
}