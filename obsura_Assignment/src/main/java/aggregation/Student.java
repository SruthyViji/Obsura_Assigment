package aggregation;
import java.util.Scanner;

public class Student {

	int rollno;
	String name; 
	Address a;
	
	public Student(int rollno, String name, Address a) {
	this.rollno=rollno;
	this.name=name;
	this.a=a;
	}
	
	public void display() {

	System.out.println("Roll no. : " + rollno );
	System.out.println("Name : "+ name);
	System.out.println("Address : "+a.add);	
	}
	
	public static void main(String[] args) {
	
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter your Roll no");
	int r =obj.nextInt();
	
	Address obj1=new Address("House no 10, Trivandrum , Kerala, India");
	Student obj2= new Student(r,"Vyga",obj1);
	obj2.display();

}
}
