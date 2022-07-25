package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers) ;
		Customer alican = new Customer(0,"Ali Can","Demirkılıç");
		customerManager.add(alican);

	}

}
