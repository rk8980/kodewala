package om.kodewala.interfacepractice;

public class Driver {

	public static void main(String[] args) {
		Hotstar h1 = new Hotstar();
		h1.signUp();
		h1.login();
		h1.subscribe();
		h1.doWatch();
		h1.cancelSubscription();
		h1.unInstall();
		
		System.out.println();
		System.out.println("-------------------");
		
		Netflix n1 = new Netflix();
		
		n1.signUp();
		n1.login();
		n1.subscribe();
	    n1.doWatch();
		n1.cancelSubscription();
		n1.unInstall();
		
		System.out.println();
		System.out.println("-------------------");
		
		MXPlayer m1 = new MXPlayer();
		
		m1.signUp();
		m1.login();
		m1.subscribe();
	    m1.doWatch();
		m1.cancelSubscription();
		m1.unInstall();
	}

}
