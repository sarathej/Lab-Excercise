package demo;
class test_1{
	void display() {
		System.out.println("test 1 is running");
	}
}
class test_2 extends test_1{
	void display() {
		super.display();
		System.out.println("test 2 is running");
	}
}
public class program26_overriding_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_2 obj=new test_2();
		obj.display();

	}

}
