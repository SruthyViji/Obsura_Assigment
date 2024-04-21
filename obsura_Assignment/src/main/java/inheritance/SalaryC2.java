package inheritance;

// 	Calculate hra (5% ofbasic pay) and pf (20% ofbasic pay). 
public class SalaryC2 extends SalaryC1 {
	
	double hra;
	double pf;
	
	public void calculate() {
	hra = 0.05 * basicPay;
	pf = 0.20 * basicPay;
	
}	

}
