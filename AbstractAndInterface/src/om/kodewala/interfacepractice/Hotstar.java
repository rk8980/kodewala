package om.kodewala.interfacepractice;

class Hotstar implements IStreamingService
{
	protected String userID;
	protected String pwd;
	@Override
	public void signUp() {
		
		System.out.println("Hotstar.signUp()");
	}

	@Override
	public void login() {
		
		System.out.println("Hotstar.login()");
	}

	@Override
	public void subscribe() {
		
		System.out.println("Hotstar.subscribe()");
	}

	@Override
	public void cancelSubscription() {
		
		System.out.println("Hotstar.cancelSubscription()");
	}

	@Override
	public void doWatch() {
		
		System.out.println("Hotstar.doWatch()");
		System.out.println("Watching movies.....");
	}

	@Override
	public void unInstall() {
		
		System.out.println("Hotstar.unInstall()");
	}
	
}

