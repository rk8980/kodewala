package om.kodewala.interfacepractice;

interface Payment
{
	 void pay(double amount);
	 static boolean validateAmount(double amount)
	 {
		 return amount > 0;
	 }
	static double getTransactionFee(double amount)
	{
		return amount * 0.5;
	}
}
 class UPI implements Payment 
 {
	    public void pay(double amount) {
	        if (Payment.validateAmount(amount)) {
	            double fee = Payment.getTransactionFee(amount);
	            System.out.println("UPI Payment Successful: " + (amount - fee));
	        } else {
	            System.out.println("Invalid Amount");
	        }
	    }

	}
 class CreditCardPayment implements Payment
 {

	@Override
	public void pay(double amount) {
		
		if (Payment.validateAmount(amount)) {
            double fee = Payment.getTransactionFee(amount);
            System.out.println("Credit card  Payment Successful: " + (amount - fee));
        } else {
            System.out.println("Invalid Amount");
        }
    
	}
	 
 }
public class Main {

	public static void main(String[] args) {
		UPI p1 = new UPI();
		p1.pay(5000);
		System.out.println();
		System.out.println("--------------");
		
		CreditCardPayment p2 = new CreditCardPayment();
		p2.pay(2000);

	}

}
