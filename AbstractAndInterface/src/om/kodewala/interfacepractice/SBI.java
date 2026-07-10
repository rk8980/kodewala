package om.kodewala.interfacepractice;

public class SBI implements IBanking {
	@Override
	public void pay()
	{
		System.out.println("SBI.pay()");
	}
	@Override
	public void settle()
	{
		System.out.println("SBI.settle()");
	}
	@Override
	public void addPayee()
	{
		System.out.println("SBI.addpayee()");
	}
	@Override
	public void modifyPayee()
	{
		System.out.println("SBI.modifyPayee()");
	}
	@Override
	public void doEKYC()
	{
		System.out.println("SBI.doEKYC()");
	}
	
}
