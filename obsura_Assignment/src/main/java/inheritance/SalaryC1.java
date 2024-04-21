package inheritance;
import java.util.Scanner;

// 	Get basic pay, deduction and bonus from console

public class SalaryC1 {
	String name;
	double basicPay;
	double deduction;
	double bonus;
	
	public void input() {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Employee Name : ");
		name =obj.nextLine();
		
		System.out.println("Enter the Basic Pay : ");
		basicPay =obj.nextDouble();
		
		System.out.println("Enter Duduction : ");
		deduction =obj.nextDouble();
		
		System.out.println("Enter the bonus : ");
		bonus =obj.nextDouble();
		}
}

