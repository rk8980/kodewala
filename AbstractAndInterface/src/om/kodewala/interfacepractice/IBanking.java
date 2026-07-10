package om.kodewala.interfacepractice;
public interface IBanking //100% abstract
{
	public abstract void pay();
	public abstract void settle();
	void addPayee();
	void modifyPayee();
	void doEKYC();
}
