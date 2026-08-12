package org.tnsif.acc.c2tc.interfacedemo;
@FunctionalInterface
interface NotificationService{
	void notifyUser(String message);
	
}
class EmailNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending mail:"+message);
		
	}
}
class SmsNotification implements NotificationService{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS:"+message);
		
	}
}
public class FunctionalInterFace {

	public static void main(String[] args) {
		NotificationService email=new EmailNotification();
		email.notifyUser("Meeeting at 10am");

		NotificationService sms=new SmsNotification();
		sms.notifyUser("Assisgnment Upload");

	}

}
