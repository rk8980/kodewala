package om.kodewala.interfacepractice;
interface IStreamingService {
	
	public abstract void signUp();
	public abstract void login();
	public abstract void subscribe();
	public void cancelSubscription();
	void doWatch();
	void unInstall();
	
}

