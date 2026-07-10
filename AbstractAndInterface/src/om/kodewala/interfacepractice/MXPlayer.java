package om.kodewala.interfacepractice;

public class MXPlayer implements IStreamingService {
	public void signUp()
	{
		System.out.println("Netflix.signUp()");
	}
	public void login()
	{
		System.out.println("Netflix.login()");
	}
	
	public void subscribe()
	{
		System.out.println("Netflix.subscribe()");
	}
	public void cancleSubscription()
	{
		System.out.println("Netflix.cancleSubscription()");
	}
	@Override
	public void cancelSubscription() {
		
		System.out.println("Netflix.cancelSubscription()");
	}
	@Override
	public void doWatch() {
		System.out.println("Netflix.doWatch()");
		System.out.println("watching both movies and series one by one....");
		
	}
	@Override
	public void unInstall() {
		System.out.println("Netflix.unInstall()");
		
	}
}
