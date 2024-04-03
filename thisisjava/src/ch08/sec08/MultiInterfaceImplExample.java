package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {

		RemoteControl rc = new SmartTelevision();

		rc.turnOn();
		rc.turnOff();

		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.youtube.com");

		SmartTelevision sm = new SmartTelevision();

		sm.turnOn();
		sm.turnOff();
		sm.search("https://www.youtube.com");

	}

}
