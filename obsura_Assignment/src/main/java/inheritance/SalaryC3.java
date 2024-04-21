package inheritance;

/*  total salary (basiepay+hra-pf-deduetion+bonus) and get the salary slip
	Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand. */


public class SalaryC3 extends SalaryC2  {
	
	double totalsalary;

	public void salarySlip() {
		
	double totalsalary = basicPay + hra - pf - deduction + bonus;
	System.out.println("Total Salary = Rs "+ totalsalary);
	
	System.out.println("\n SALARY SLIP \n");
	System.out.println("Basic Pay : Rs " + basicPay);
	System.out.println("HRA : " +hra);
	System.out.println("pf: Rs " + pf);
	System.out.println("Bonus : Rs "+ bonus);
	System.out.println("Total Salary by hand: Rs " + totalsalary );
	
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaryC3 obj1=new SalaryC3();
		obj1.input();
		obj1.calculate();     
		obj1.salarySlip();

	}

}
