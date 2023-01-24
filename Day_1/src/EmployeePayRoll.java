import java.util.Scanner;;

public class EmployeePayRoll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your BasicPay ");
		int basicPay= sc.nextInt();
		double hra=0,da=0;
		if(basicPay>=5000) {
			hra=(.1*basicPay);
			da=(.2*basicPay);
			System.out.println("HRA is " + hra );
            System.out.println("DA is " + da );
		}else if(basicPay<=0) {
			System.out.println("Please enter correct BasicPay");
		}else {
			hra=(.1*basicPay);
			da=(.2*basicPay);
			System.out.println("HRA is " + hra );
            System.out.println("DA is " + da );
		}
		System.out.println("GrossPay is "+(basicPay+ hra + da) );
	}
}